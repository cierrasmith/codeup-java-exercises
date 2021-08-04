import java.util.Scanner;

public class MethodsExercises {

    //1. Basic arithmetic
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //2. Create a method that validates that user input is in a certain range

    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println(userInput + " is in the range!");
        } else {
            System.out.println(userInput + " is not in the range, try again.");
            return getInteger(min, max);
        }
        return userInput;
    }

    //3. Calculate the factorial of the number


    public static int getFactorialNum(int n) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number between 1 and 10: ");

        int result = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;

    }



    public static void main(String[] args) {

        System.out.println(addition(3, 5));

        System.out.println(subtraction(3, 4));

        System.out.println(multiplication(50, 2));

        System.out.println(division(10, 2));

        System.out.println(modulus(12, 8));

        System.out.println(getInteger(1, 10));

        getFactorialNum(4);





    }
}
