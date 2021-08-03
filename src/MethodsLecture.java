import java.util.Scanner;

public class MethodsLecture {

    // Methods will be declared inside of the class but outside of the main method.

    static double piValue = 3.14;


    public static String sayHello(String usersName) {
        String helloMessage = String.format("Hello, %s!", usersName);
        return helloMessage;
    }

    public static double getAreaOfCircle(double radius) {
        return piValue * (radius * radius);
    }

    public static double getAreaOfCircle(long radius) {
        return piValue * (radius * radius);
    }

    public static boolean doesUserWantToContinue() {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to continue?");

        String usersResponse = input.nextLine();

        if (usersResponse.equals("yes")) {
            return true;
        } else if (usersResponse.equals("no")) {
            return false;
        } else {
            return doesUserWantToContinue();
        }
    }

    // This executes the code, and methods should not be declared in here.
    public static void main(String[] args) {

        if (doesUserWantToContinue()) {

            System.out.println(sayHello("Cierra"));

            int radiusOfCircle = 4;

            System.out.println(getAreaOfCircle(radiusOfCircle));
        }
    }
}
