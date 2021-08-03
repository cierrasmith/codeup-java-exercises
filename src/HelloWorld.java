public class HelloWorld {

    public static void main(String[] args){

        System.out.println("Hello, World!"); //strings inside of Java must be double quotes

        // JS way
        // let nameOfVariable = 123;

        //JAVA way
//        int newNumber;  must know datatype before declaring the variable
//        newNumber = 5;

        byte dayOfMonth = 31;

        short employees = 129;

        int carPrice = 50000;

        long diameterOfMilkyWay = 7573243634645644L; // put L at the end only for literals

        float gradeAverage = 93.35f;

        double testDouble = 93.5532452;

        char yesNo = 'Y';

        boolean cierraLikesWine = true;

        boolean cierraHatesPizza = false;

        String name = "Cierra Smith";

        String criminalMindsQuote = "\"Some cheesy quote\" \n - Probably Mark Twain"; // \n is a new line character
        System.out.println(criminalMindsQuote);

        String rockNRoll = "\t\\m/"; // \t is the tab character
        System.out.println(rockNRoll);

        // Constants are denoted by final keyword. Values cannot change while a program is running
        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";

        int sum = 5 + 6; // binary has 2 operands
        int difference = 5 - 6;
        int multiply = 5 * 6;
        int remainder = 4 % 2;
        double divide = 10 / 3f;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(multiply);
        System.out.println(remainder);
        System.out.println(divide);

        int someNumber = 5;
//        System.out.println(++someNumber); // will immediately increment when ran
//        someNumber++;

//        System.out.println(someNumber++); // 5 (will increment after first run)
//        System.out.println(someNumber++); // 6
//        System.out.println(someNumber++); // 7

        someNumber += 1;
        System.out.println(someNumber);

        // Implicit casting
        int myNewInteger = 900;
        long morePrecise = myNewInteger;

        // Explicit casting - getting less precise and losing the decimals
        double pi = 3.14159;
        int almostPi = (int) pi;

        System.out.println(almostPi);

        // Exercises

        //1
        int myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber);

        //2
        String myString = "On behalf of the Moon I will punish you";
        System.out.println(myString);

        //3
        myString = "This is a new string";
        System.out.println(myString);

////        //4
////        myString = 3.14159;
////
////        //5
////        long myNumber = ;
////        System.out.println(myNumber);
////
////        //6
////        myNumber = 3.14;
//
//        //7
//        myNumber = 123L;
//        System.out.println(myNumber);
//
//        //8
//        myNumber = 123;
//        System.out.println(myNumber);




    }

}
