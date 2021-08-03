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


    public static void main(String[] args) {

        System.out.println(addition(3, 5));

        System.out.println(subtraction(3, 4));

        System.out.println(multiplication(50, 2));

        System.out.println(division(10, 2));

        System.out.println(modulus(12, 8));


    }
}
