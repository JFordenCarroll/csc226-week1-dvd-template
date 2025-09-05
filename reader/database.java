package reader;
import java.util.TreeMap;
import java.util.List;
import java.util.stream.Collectors;

public class database {

    private TreeMap<String, VideoObj> videoList;

    public database() {
        videoList = new TreeMap<>();
    }

    public void addVideo(VideoObj video) {
        videoList.put(video.getTconst(), video);
    }

    public VideoObj getVideo(String tConst){
        return videoList.get(tConst);
    }

    public void purgeBadVideos() {
        videoList.values().removeIf(video -> video.getTitleType()==null);
    }

    public void listVideos(int amount) {
        for(VideoObj video: videoList.values()){
            if(amount<0){
                break;
            }
            System.out.println(video.toString());
            amount--;
        }
    }
    public int getLength(){
        return videoList.size();
    }

    public void getHighestRatedVideos(int amount) {
    videoList.values()  
        .stream()
        .sorted((v1, v2) -> Double.compare(v2.getAverageRating(), v1.getAverageRating()))
        .limit(amount)
        .forEach(video -> System.out.println(video.toString()));
    }
    public void getRatingDistribution(){
        int[] totals = new int[11];
        for(VideoObj video: videoList.values()){
            int rating = (int) video.getAverageRating();
            totals[rating]+=1;
        }
        // print out the distribution
        for (int i = 0; i <= 10; i++) {
            double percentage = ((double) totals[i] / videoList.size()) * 100;
            System.out.printf("%.2f%% of movies had a rating of: %d%n", percentage, i);
        }
    }

    public void getAverageRatingByGenre() {
        // TODO: Calculate and display the average rating for each genre
        // Hint: Use a Map to store genre->rating totals, iterate through all videos
        // Consider that movies can have multiple genres (separated by commas)
    }

    public void getMoviesByDecade() {
        // TODO: Group and display movies by decade (1890s, 1900s, etc.)
        // Use startYear to determine decade, handle movies with startYear = 0
    }

    public void getAverageRuntimeByGenre() {
        // TODO: Calculate and display the average runtime for each genre
        // Similar to rating by genre, but use runtimeMinutes (skip if 0 or null)
    }

    public void getMostPopularGenres(int topN) {
        // TODO: Find and display the most popular genres by number of movies
        // Count how many movies belong to each genre, sort by count
    }

    public void getVoteCountDistribution() {
        // TODO: Analyze and display the distribution of vote counts (low, medium, high)
        // Define ranges (e.g., <1000=low, 1000-10000=medium, >10000=high)
    }

    public void compareAdultVsNonAdult() {
        // TODO: Compare statistics between adult and non-adult content
        // Calculate averages for ratings, vote counts, runtime for each category
    }

    public void getTitleTypeDistribution() {
        // TODO: Display the distribution of different title types (movie, short, etc.)
        // Count occurrences of each titleType, show as percentages
    }

    public void getMoviesWithMissingData() {
        // TODO: Identify and count movies with missing or incomplete data
        // Check for null values, empty strings, or "\\N" markers in key fields
    }

    public void getTopVotedMovies(int amount) {
        // TODO: Display movies with the highest number of votes
        // Sort by numVotes in descending order, similar to getHighestRatedVideos
    }

    public void getRuntimeDistribution() {
        // TODO: Analyze and display runtime distribution (short, medium, long films)
        // Define categories: short (<30 min), medium (30-120 min), long (>120 min)
    }
}
