import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %1.2f.", pi); //floats the decimal to digits resulting in (3.14)

        //Scanner Class
        //1. Prompt the user to enter an integer and store that value in an int variable using nextInt
        Scanner scanner = new Scanner(System.in); // Can name scanner anything

        System.out.print("\nEnter an integer: "); // if you input something that is not an integer, it will return with an InputMismatchException.
        int userInput = scanner.nextInt();
//
        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//        //2. Prompt a user to enter 3 words and store each in a separate variable.
        System.out.print("\nEnter 3 words: ");
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
//
//        // If you enter more than 3, it only pulls the first 3.
//        // If you enter less than 3, it waits for you to enter more.
        System.out.printf("%s\n %s\n %s", input1, input2, input3);

        //3. Prompt a user to enter a sentence then store in a String variable using the next method. Then display that sentence back to the user.
        System.out.print("\nEnter a sentence: ");
//        String inputSentence = scanner.next(); // If you use scanner.next it'll only bring back the first word

        //4. Rewrite using the nextLine method
        String inputSentence = scanner.nextLine(); // Will run the whole sentence, had to comment out everything else for it to work
        System.out.printf("%s", inputSentence);

        // Calculate the perimeter and area of Codeup's classrooms
        //1. Prompt the user to enter values of length and width of a classroom at Codeup.
        System.out.print("\nEnter the length and width of a classroom at Codeup: ");

        System.out.println("\nEnter the width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("\nEnter the length: ");
        double length = Double.parseDouble(scanner.nextLine());
        double area = length * width;
        double perimeter = (width * 2) + (length * 2);

        System.out.println("\nArea: " + area);
        System.out.println("\nPerimeter: " + perimeter);




    }

}
