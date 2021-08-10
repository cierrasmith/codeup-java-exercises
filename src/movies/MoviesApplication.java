package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println(menuOptions());

            int response = promptUser();
            running = runUserOption(response);
        }

    }

    public static boolean runUserOption(int option) {
        boolean continueRunning = true;

        switch (option) {
            case 0:
                System.out.println("Okay good-bye.");
                continueRunning = false;
                break;
            case 1: // View all movies
                System.out.println("\n");
                for(Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\n");
                viewByCategory("animated");
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                viewByCategory("drama");
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                viewByCategory("horror");
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                viewByCategory("scifi");
                System.out.println("\n");
                break;
        }

        return continueRunning;
    }

    public static void viewByCategory(String category) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() +" -- " + movie.getCategory());
            }
        }
    }

    public static String menuOptions() {
        String options = "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n";

        return options;
    }

    public static int promptUser() {
        Input input = new Input();
        System.out.println("Enter your choice or select 0 to exit: ");
        int response = input.getInt(0, 5);

        return response;
    }


    // Continue working on this
    public static MoviesArray[] addMovie(MoviesArray[] movie, MoviesArray movieToAdd) {
        MoviesArray[] newMovie = Arrays.copyOf(movie, movie.length + 1);
        Input addMovie = new Input();
        newMovie[newMovie.length - 1] = movieToAdd;

        return newMovie;
    }
}
