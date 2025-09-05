package reader;
import java.util.TreeMap;

public class database {

    private TreeMap<String, VideoObj> videoList;

    public database() {
        videoList = new TreeMap<>();
    }

    public void addVideo(VideoObj video) {
    }

    public VideoObj getVideo(String tConst){
    return videoList.get(tConst);
    }

    public void purgeBadVideos() {
    // Remove videos from videoList that are considered "bad" or invalid.
    // Think about what makes a video "bad" in this context...
    }

    public void listVideos(int amount) {
        // Print up to 'amount' videos from the videoList.
        // For each video, use the toString() function you wrote in your VideoObj class to display its information.
    }
    public int getLength(){
    // Return the number of videos currently stored in the videoList.
    return 0;
    }

    public void getHighestRatedVideos(int amount) {
    /*
     * This function should print out the top 'amount' videos with the highest average ratings.
     * A "highest rated" video is one with a higher average rating compared to others.
     * You should sort the videos by their average rating (highest first), then print the top N.
     * For each video, use the toString() function you wrote in your VideoObj class to display its information.
     *
     * Example: If amount is 5, print the 5 videos with the highest ratings.
     */
    }
    // 
    public void getRatingDistribution(){
    /*
     * This function should calculate and print the distribution of movie ratings.
     * A "distribution" shows how data is spread across different categories or values.
     * In this case, it means showing what percentage of movies have each possible rating (0 to 10).
     * For example, you might find that 20% of movies have a rating of 7, 10% have a rating of 8, etc.
     * This helps you see which ratings are most common in your dataset.
     * The function should count how many movies have each rating, then print the percentage for each rating.
     */
    // Use the following print line for the results. 
    //System.out.printf("%.2f%% of movies had a rating of: %d%n", percentage, i);
    }
}
