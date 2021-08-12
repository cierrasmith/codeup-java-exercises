package exceptions;

public class ExceptionsLecture {

    public static void main(String[] args) {
        int [] myArray = {1, 2, 3, 4, 5};

//        System.out.println(myArray[5]); // throws an error
        try {
            throw new RuntimeException("hello");
        } catch(RuntimeException e) {
            System.out.println("OUCH! Runtime exception");
        }

        System.out.println("End of program");
    }
}
