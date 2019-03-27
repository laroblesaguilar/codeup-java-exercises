package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    static Movie[] MovieArray = MoviesArray.findAll();

    static void filterMovies(int userSelection) {
        if (userSelection == 1) {
            for (Movie movie : MovieArray) {
                System.out.println(movie.getName() + " - - " + movie.getCategory());
            }
        } else if (userSelection == 2) {
            for (Movie movie : MovieArray) {
                if (movie.getCategory().equals("animated")) {
                    System.out.println(movie.getName());
                }
            }
        } else if (userSelection == 3) {
            for (Movie movie : MovieArray) {
                if (movie.getCategory().equals("drama")) {
                    System.out.println(movie.getName());
                }
            }

        } else if (userSelection == 4) {
            for (Movie movie : MovieArray) {
                if (movie.getCategory().equals("horror")) {
                    System.out.println(movie.getName());
                }
            }
        } else if (userSelection == 5) {
            for (Movie movie : MovieArray) {
                if (movie.getCategory().equals("scifi")) {
                    System.out.println(movie.getName());
                }
            }
        }
    }

    static void displayMovies() {
        Input scnr = new Input();
        boolean keepGoing = true;

        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - Exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - Add Movie");
            System.out.println("Enter your choice: ");
            int userSelection = scnr.getInt();
            if (userSelection == 0) {
                keepGoing = false;
                break;
            }

            if (userSelection == 6) {
                System.out.println("Enter movie title");
                scnr.getLine();
                String userTitle = scnr.getLine();
                System.out.println("Enter movie category");
                String userCategory = scnr.getString();

                Movie userMovie = new Movie(userTitle, userCategory);
                Movie[] updatedList = addUserMovie(MovieArray, userMovie);

                for (Movie movie : updatedList) {
                    System.out.println(movie.getName() + " - - " + movie.getCategory());
                }

                MovieArray = updatedList;
            }
            filterMovies(userSelection);
            System.out.println("Continue?");
            keepGoing = scnr.yesNo();
        } while (keepGoing);
    }

    static Movie[] addUserMovie(Movie[] listOfMovies, Movie userMovie) {
        Movie[] updatedList = Arrays.copyOf(listOfMovies, listOfMovies.length + 1);
        updatedList[updatedList.length - 1] = userMovie;
        return updatedList;
    }


    public static void main(String[] args) {
        displayMovies();

    }
}
