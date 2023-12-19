package DesignPattern.composite.problemStatement;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("movie");
        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("comedyMovie");
        File hulchul = new File("hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
