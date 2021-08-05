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
        System.out.println(userSaidYes);
        if (userSaidYes) {
            return true;
        } else {
            return false;
        }

    }



    public int getInt(int min, int max) {
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
        System.out.print("Please enter an integer: ");
        int usersInteger = scanner.nextInt();
        return usersInteger;
    }

    public double getDouble(double min, double max) {
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println(userInput + " is in the range!");
        } else {
            System.out.println(userInput + " is not in the range, try again.");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        double userDoubleInput = scanner.nextDouble();
        return userDoubleInput;

    }

}

class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        input.getString();
        System.out.println(input.yesNo());
        input.getInt(0, 15);
        input.getInt();
        input.getDouble(-10.10, 10.10);
        input.getDouble();
    }
}


