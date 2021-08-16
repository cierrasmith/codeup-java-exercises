import movies.Movie;
import movies.MoviesArray;
import util.Input;

import java.util.Scanner;

public class ConsoleAdventureGame {

    public static boolean isUserReadyToStart() {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready to start the game?");
        String usersResponse = input.nextLine();

        if (usersResponse.equals("yes")) {
            return true;
        } else if (usersResponse.equals("no")) {
            return false;
        } else {
            return isUserReadyToStart();
        }
    }

    public static String yourName() {
//        System.out.println("Alright let's get this started! What is your name?");
        Scanner input = new Scanner(System.in);
        String usersName = input.nextLine();
        return usersName;
    }

    public static String menuOptions() {
        String options = "What would you like to do?\n" +
                "\n" +

                "a - Attack! (Decreases enemy health)\n" +
                "b - Drink Potion (Increases " + yourName() + "'s health)\n" +
                "c - Run! (Game over)\n";

        return options;
    }

    public static String promptUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a, b, or c: ");
        String response = input.nextLine();

        if (response.equalsIgnoreCase("a") || response.equalsIgnoreCase("b") || response.equalsIgnoreCase("c")) {
            return response;
        } else {
            System.out.println("That is an incorrect choice, try again!");
        }
        return promptUser();
    }

    public static boolean runUserOption() {
        boolean continueRunning = true;
        String usersChoice = promptUser();

        switch (usersChoice.charAt(0)) {
            case 'a':
                System.out.println("DEFEAT THE ENEMY");
                break;
            case 'b':
                System.out.println("INCREASE THE HEALTH");
                break;
            case 'c':
                System.out.println("Maybe next time.");
                continueRunning = false;
                break;
        }

        return continueRunning;
    }




    public static void main(String[] args) {
        if (isUserReadyToStart()) {
            System.out.println("Alright let's get this started! What is your name?");
            System.out.println(menuOptions());
            System.out.println(promptUser());
            System.out.println(runUserOption());
        }
    }
}
