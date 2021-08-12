package exceptions;

import util.Input;

import java.util.InputMismatchException;

public class MyApp {
    public static final int INVALID_CHOICE = 0;
    private static final int FIRST_CHOICE = 1;
    private static final int SECOND_CHOICE = 2;
    private static final int EXIT_CHOICE = 3;

    /*
    MAIN MENU-PRINTING AND USER CHOICE LOOP
    Loop will exit when user enters quit choice(3)
    1 : print hello
    2 : print I'm hungry
    3 : quit
     */

    public void runMyApp() {
        int userChoice = INVALID_CHOICE;

        Input input = new Input();
        do {
            printMenu();

            try {
                userChoice = input.getInt(1, 3);
                doUserChoice(userChoice);
            } catch (InputMismatchException e) {
                System.out.println("Please type an integer between 1 and 3!");
                input = new Input();
            }

        } while (userChoice != EXIT_CHOICE);
    }

    private void doUserChoice(int userChoice) {
        switch (userChoice) {
            case FIRST_CHOICE:
                System.out.println("Hello");
                break;
            case SECOND_CHOICE:
                System.out.println("I'm hungry");
                break;
        }
    }

    private void printMenu() {
        System.out.println("Enter 1 or 2 or 3: ");
    }

    public static void main(String[] args) {
        // 1. Create an application object
        // 2. Run the menu loop
        // 3. Exit the program when user enters quit option

        MyApp myApp = new MyApp(); // 1.

        myApp.runMyApp(); // 2.

        System.out.println("End of program.");
    }
}
