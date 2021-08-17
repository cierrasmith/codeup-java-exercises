package adventureGame;

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

    public static void yourName() {
        System.out.println("Alright let's get this started! What is your name?");
        Scanner input = new Scanner(System.in);
        String usersName = input.nextLine();
        System.out.println("Nice to meet you " + usersName + "!");
    }

    public static String menuOptions() {
        String options = "What would you like to do?\n" +
                "\n" +

                "1 - Attack! (This decreases enemy health)\n" +
                "2 - Drink Potion (This increases your health)\n" +
                "3 - Run! (Game over)\n";

        return options;
    }

    public static int promptUser() {
        Input input = new Input();
        System.out.println("Select a number to begin: ");
        int response = input.getInt(1, 3);
        return response;

//        if (response.equalsIgnoreCase("a") || response.equalsIgnoreCase("b") || response.equalsIgnoreCase("c")) {
//            return response;
//        } else {
//            System.out.println("That is an incorrect choice, try again!");
//        }
//        return promptUser();
    }

    public static boolean runUserOption(int option) {
        boolean continueRunning = true;

        switch (option) {
            case 1:
                attackMenu();
                break;
            case 2:
                System.out.println("Your health has increased by 10.");
                break;
            case 3:
                System.out.println("Maybe next time.");
                continueRunning = false;
                break;
        }

        return continueRunning;

    }

    public static void attackMenu() {
        String options = "Select an attack:\n" +
                "\n" +
                "1 - Lightning Strike\n" +
                "2 - Ring Of Fire\n" +
                "3 - Tsunami Shot\n" +
                "4 - Nothing, run away!\n";
        System.out.println(options);
    }

    public static boolean runAttackOption(int option) {
        boolean continueRunning = true;
        User currentUser = new User();

        switch (option) {
            case 1:
                currentUser.setCurrentAttack(new LightningStrike());
                currentUser.useWeapon();
                break;
            case 2:
                currentUser.setCurrentAttack(new RingOfFire());
                currentUser.useWeapon();
                break;
            case 3:
                currentUser.setCurrentAttack(new TsunamiShot());
                currentUser.useWeapon();
                break;
            case 4:
                System.out.println(menuOptions());
                continueRunning = false;
        }
        return continueRunning;
    }



    public static void main(String[] args) {

        if (isUserReadyToStart()) {
            yourName();
            System.out.println(menuOptions());
            runUserOption(promptUser());
            runAttackOption(promptUser());
        } else {
            System.out.println("Okay, see you later!");
        }





    }

}
