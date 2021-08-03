import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        //1. Loop Basics
        // a. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }

        // b. Do While
        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        }
//        while (i <= 100);

        // Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        }
//        while (i >= -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i*=i;
//        }
//        while (i < 1000000);

        //c. For
        // Refactor the previous two exercises to use a for loop instead.

//        for (int i = 5; i <= 15 ; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100 ; i+=2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10 ; i+=5) {
//            System.out.println(i);
//        }

//        for (long i = 2L; i < 1000000L ; i*=i) {  // Good practice to use L when using long
//            System.out.println(i);
//        }

        //2. Fizzbuzz
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//
//            else if (i % 3 == 0) { //
//                System.out.println("Fizz");
//
//            }
//
//            else if (i % 5 == 0) {
//                System.out.println("Buzz");
//
//            } else {
//                System.out.println(i);
//            }
//        }

        //3. Display a table of powers
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Please enter an integer: ");
//        int usersInteger = scanner.nextInt();
//
//        System.out.print("Would you like to continue? ");
//        boolean userRespondedWithYes = scanner.next().toLowerCase().contains("y");
//
//
//        if (userRespondedWithYes) {
//            System.out.println("\nGreat, we will continue.");
//            System.out.println("\nBelow is your table!\n");
//            System.out.println("number | squared | cubed \n------ | ------- | -----");
//            for (int i = 1; i <= usersInteger; i++) {

                    // This is how Ry did it, looks much cleaner than mine
//                    System.out.printf("%-6d", i);
//                    System.out.print(" | ");
//                    System.out.printf("%-7d", i * i);
//                    System.out.print(" | ");
//                    System.out.print(i * i * i);
//                    System.out.println();

                    // This is mine
//                System.out.println(i + "\t   | " + i * i + "\t     | " + i * i * i);
//            }
//        }else{
//            System.out.println("No problem, we won't continue.");
//        }


        //4. Convert given number grades into letter grades
        System.out.print("Please enter a numerical grade: ");
        int grade = scanner.nextInt();

        System.out.print("Would you like to continue? ");
        boolean userRespondedWithYes = scanner.next().toLowerCase().contains("y");

        if (userRespondedWithYes) {
            System.out.println("\nGreat, we will continue.");
            if (grade >= 88 && grade <= 100) {
                System.out.println("You have an A.");
            }

            if (grade >= 80 && grade <= 87) {
                System.out.println("You have a B.");
            }

            if (grade >= 67 && grade <= 79) {
                System.out.println("You have a C.");
            }

            if (grade >= 60 && grade <= 66) {
                System.out.println("You have a D.");
            }

            if (grade >= 0 && grade <= 59) {
                System.out.println("You have a F.");
            }

        } else {
            System.out.println("No problem, we won't continue.");
        }

    }
}
