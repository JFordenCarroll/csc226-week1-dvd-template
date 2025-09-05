package reader;

import java.util.Arrays;

public class VideoObj implements IMDB {
    private String tconst;
    private String titleType;
    private String primaryTitle;
    private String originalTitle;
    private boolean isAdult;
    private int startYear;
    private Integer endYear;
    private Integer runtimeMinutes;
    private String[] genres;
    private double averageRating;
    private int numVotes;

    

    public VideoObj(){
    }

    /*
    * VideoObj class
    *
    * This class should represent a single video (movie, TV show, etc.) and store all relevant information about it.
    * A VideoObj should be able to hold information collected from both the basics.tsv and ratings.tsv files.
    *
    * You should include fields for all the data you need (such as tconst, titleType, title, year, genres, rating, votes, etc.).
    *
    * This class implements the IMDB interface. An interface in Java is like a contract: it lists methods that a class must provide.
    * Look at the IMDB interface to see what methods you are required to implement in this class.
    *
    * You will need to write constructors, getters, setters, and any other methods needed to store and access video data.
    *
    * The toString() method below is provided as an example of how you might display a VideoObj's information.
    */

    // Getters and setters for each field
   
    @Override
    public String toString() {
        return "VideoObj{" +
                "tconst='" + tconst + '\'' +
                ", titleType='" + titleType + '\'' +
                ", primaryTitle='" + primaryTitle + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", isAdult=" + isAdult +
                ", startYear=" + startYear +
                ", endYear=" + endYear +
                ", runtimeMinutes=" + runtimeMinutes +
                ", genres=" + Arrays.toString(genres) +
                ", averageRating=" + averageRating +
                ", numVotes=" + numVotes +
                '}';
    }
}


