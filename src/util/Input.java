package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Please enter a string: ");
        String userString = scanner.next();
        return userString;
    }

    public boolean yesNo() {
        System.out.println("Would you like to continue, yes or no? ");
        boolean userSaidYes = scanner.next().toLowerCase().contains("y");

        if (userSaidYes) {
            return true;
        } else {
            return false;
        }
    }


    public int getInt(int min, int max) {
        System.out.println("Please enter an integer between 0 and 15: ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println(userInput + " is in the range!");
        } else {
            System.out.println(userInput + " is not in the range, try again.");
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt() {
        System.out.print("Please enter any integer: ");
        int usersInteger = scanner.nextInt();
        return usersInteger;
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a number with a decimal between -10.5 and 10.5: ");
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            System.out.println(userInput + " is in the range!");
        } else {
            System.out.println(userInput + " is not in the range, try again.");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        System.out.println("Please enter any number with a decimal: ");
        double userDoubleInput = scanner.nextDouble();
        return userDoubleInput;
    }

}




