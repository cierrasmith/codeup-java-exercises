public class MethodsLecture {

    // Methods will be declared inside of the class but outside of the main method.

    public static String sayHello(String usersName) {
        String helloMessage = String.format("Hello, %s!", usersName);
        return helloMessage;
    }

    // This executes the code, and methods should not be declared in here.
    public static void main(String[] args) {

        System.out.println(sayHello("Cierra"));
    }

}
