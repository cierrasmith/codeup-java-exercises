import java.util.Scanner;

public class ControlStatementsLecture {

    public static void main(String[] args) { // can use main and tab as a shortcut

        String myName = "Cierra";
        int age = 31;

        String someoneElsesName = "Herman";

        System.out.println(myName.equals(someoneElsesName)); // Would equal false unless I changed it to my name

        boolean isUserNameCierraAndIs31 = (myName.equals("Cierra") && age >= 31);
        System.out.println("User meets the requirements is a " + isUserNameCierraAndIs31 + " statement.");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like to continue? ");
        boolean userRespondedWithYes = scanner.nextLine().toLowerCase().contains("y"); // The toLowerCase makes it not case sensitive if the user uses "Y"

        System.out.println(userRespondedWithYes);

        if (userRespondedWithYes) {
            System.out.println("Okay we will continue.");
        }else{
            System.out.println("Okay we will not continue");
        }

        //Let's ask user for fav color
        System.out.print("Hey, what is your favorite color?");
        String usersFavColor = scanner.nextLine();

        switch (usersFavColor) {
            case "blue":
                System.out.println("Hey that's mine too.");
                break;
            case "red":
                System.out.println("That's Herman's favorite color as well.");
                break;
            default:
                System.out.println("Hey that sounds like a cool color.");
                break;
        }

        boolean userAcceptedTerms = false;

        while (!userAcceptedTerms) {
            System.out.println("Do you agree to our terms and services?");
            userAcceptedTerms = scanner.nextLine().toLowerCase().contains("y");
        }
        System.out.println("Thank you for accepting our terms and services!");


        boolean userKnowsTheirOwnName = false;

        do {
            System.out.println("Type in your name");
            userKnowsTheirOwnName = scanner.nextLine().equals("cierra");
        }while (!userKnowsTheirOwnName);

        System.out.println("Ya, you know your name.");

        // This is a classic for loop
        for (int i = 0; i <= 100 ; i++) {
            System.out.println("We are at number " + i);
        }

        // This is a for loop that will skip the number 45
        for (int i = 0; i < 100; i++) {
            if (i == 45) {
                System.out.println("Skipping number 45");
                continue;
            }

            System.out.println(i);
        }
        // This is a for loop that will stop at the number 45
        for (int i = 0; i < 100; i++) {
            if (i == 45) {
                System.out.println("Breaking at 45");
                break;
            }

            System.out.println(i);
        }

    }

}
