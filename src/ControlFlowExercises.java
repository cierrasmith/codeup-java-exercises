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

//        for (long i = 2; i < 1000000 ; i*=i) {
//            System.out.println(i);
//        }

        //2. Fizzbuzz
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }

            else if (i % 3 == 0) { //
                System.out.println("Fizz");

            }else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }
    }
}
