# Assignment 1: IMDB Data Analysis - Week 1 Homework

## Overview:

This assignment is a comprehensive reintroduction to the fundamental programming concepts you learned in CSC110 and CSC111. You will work with real IMDB movie data to build a complete data analysis system.

### Learning Objectives:
By completing this assignment, you will demonstrate proficiency in:
- **Object-Oriented Programming**: Implementing interfaces, creating classes, and using inheritance
- **Data Structures**: Working with Maps, TreeMaps, Arrays, and Collections
- **File I/O**: Reading and parsing tab-separated value (TSV) files
- **Exception Handling**: Managing IOException and data parsing errors
- **Data Analysis**: Implementing statistical analysis and data aggregation methods
- **Algorithm Implementation**: Sorting, filtering, and searching through datasets
- **String Manipulation**: Processing and cleaning text data

## Provided Files:

### Core Implementation Files:
- **`IMDB.java`** - Interface defining the contract for video objects (DO NOT MODIFY)
- **`VideoObj.java`** - Complete implementation of IMDB interface (DO NOT MODIFY)
- **`database.java`** - Database class with some implemented methods and TODO methods for you to complete
- **`main.java`** - Main runner class with complete TSV parsing (DO NOT MODIFY)

### Data Files:
- **`subset.title.basics.tsv`** - Contains basic movie information (title, year, genre, runtime, etc.)
- **`subset.title.ratings.tsv`** - Contains rating and vote count data for movies

The TSV files contain a subset of IMDB's non-commercial datasets. More details available at: [IMDB Non-Commercial Datasets](https://developer.imdb.com/non-commercial-datasets/)

## Assignment Requirements:

### What You Need to Implement:

You must implement **10 analysis methods** in the `database.java` class. Each method has a specific TODO comment explaining what it should accomplish. The existing code provides examples of data manipulation patterns you should follow.

#### Required Methods to Implement:

1. **`getAverageRatingByGenre()`** - Calculate and display average ratings grouped by genre
2. **`getMoviesByDecade()`** - Group and display movies by decade (1890s, 1900s, etc.)
3. **`getAverageRuntimeByGenre()`** - Calculate average runtime for each genre
4. **`getMostPopularGenres(int topN)`** - Find the most popular genres by movie count
5. **`getVoteCountDistribution()`** - Analyze vote count patterns (categorize as low/medium/high)
6. **`compareAdultVsNonAdult()`** - Compare statistics between adult and non-adult content
7. **`getTitleTypeDistribution()`** - Show distribution of title types (movie, short, TV series, etc.)
8. **`getMoviesWithMissingData()`** - Identify and count incomplete data entries
9. **`getTopVotedMovies(int amount)`** - Display movies with highest vote counts
10. **`getRuntimeDistribution()`** - Categorize movies by runtime (short/medium/long films)

### Implementation Guidelines:

- **Preserve Function Signatures**: Do not modify method names, parameters, or return types
- **Follow Existing Patterns**: Study the implemented methods (`getHighestRatedVideos`, `getRatingDistribution`) for coding style
- **Use Java Streams**: Leverage Stream API for data processing where appropriate
- **Handle Edge Cases**: Account for null values, missing data (marked as "\\N"), and empty collections
- **Provide Clear Output**: Format your console output to be readable and informative
- **Error Handling**: Ensure your methods don't crash on unexpected data

### Technical Requirements:

1. **Data Parsing**: The main class already handles TSV file reading and object creation
2. **Data Cleaning**: Bad/incomplete videos are automatically removed via `purgeBadVideos()`
3. **Data Structure**: Use the existing TreeMap structure for consistent ordering
4. **Output Format**: Print results to console in a clear, formatted manner
5. **Performance**: Your implementations should handle the full dataset efficiently

### Testing Your Implementation:

1. **Compile**: `javac reader/*.java`
2. **Run**: `java -cp . reader.Main`
3. **Verify**: Check that your new methods produce reasonable results when called

### Submission Requirements:

- Only modify the `database.java` file
- Implement all 10 required methods
- Ensure your code compiles without errors
- Test your methods work with the provided dataset
- Follow Java naming conventions and coding standards

### Grading Criteria:

- **Correctness** (40%): Methods produce accurate results
- **Code Quality** (30%): Clean, readable, well-structured code
- **Error Handling** (15%): Proper handling of edge cases and exceptions
- **Output Formatting** (15%): Clear, professional output presentation

## Getting Started:

1. Examine the existing implemented methods to understand the data structure and coding patterns
2. Run the program to see how the current analysis methods work
3. Start with simpler methods like `getTitleTypeDistribution()` before tackling complex ones
4. Test each method individually by calling it from main
5. Use the provided data files to verify your results make sense

Remember: The goal is to demonstrate your understanding of fundamental programming concepts while working with real-world data. Focus on writing clean, efficient code that properly handles the movie dataset.

