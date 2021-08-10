import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
//        int[] anArray = new int[10]; //the number in the brackets is the length of the array

        // If you don't know the exact length and don't want to hard code:
//        int numberOfElements = 10;
//        int[] anArray = new int[numberOfElements];

//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;

        // If you don't assign it a value, it will do the default value

//        System.out.println(numbers[0]); // 1
//        System.out.println(numbers[1]); // 2
//        System.out.println(numbers[2]); // 0 -- default value
//        System.out.println(numbers[3]); // Array Index Out Of Bounds Exception

//        int[] anArray = {1, 2, 3, 4, 5, 6};
//        System.out.println(anArray.length); // 6


        // Enhanced for loop, specifying the data type
        // for (dataType item : array) {}
//        String[] languages = {"html", "css", "javascript", "java"};
//
//        for (String language : languages) {
//            System.out.println(language);
//        }

        // Arrays Class
        // void Arrays.fill(arrayName, value)

//        int scoreCard[] = {2,2,1,8,3,2,2,4,2};
//
//        Arrays.fill(scoreCard, 0); // fills all elements fof the specified array with the specified value
//        System.out.println("Score Card has been reset \n" + Arrays.toString(scoreCard));
//
//        // boolean Arrays.equals(array1, array2) // returns true if both arrays are the same type and all elements are equal to each other
//
//        // array Arrays.copyOf(array, length) // returns a copy of the given array with the specified length
//        int[] org = new int[] {1,2,3};
//        System.out.println("Original array");
//
//            int[] copy = Arrays.copyOf(org, 5);
//
//            copy[3] = 11;
//            copy[4] = 55;
//
//            System.out.println(Arrays.toString(copy));
//
//            // this will resize the arrays
//        int [] a1 = {1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(a1));
//
//        a1 = Arrays.copyOf(a1, 10);
//
//        System.out.println(Arrays.toString(a1));
//
//        a1 = Arrays.copyOf(a1, 3);
//
//        System.out.println(Arrays.toString(a1));
//        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println();

            for (int column : row) {
                System.out.print(column + " | ");
            }
        }



    }
}

