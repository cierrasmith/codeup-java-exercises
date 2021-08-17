package practice;

public class Practice {

    public static double multiple(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public static double multiple(double numOne, double numTwo) {
        return numOne * numTwo;
    }

    public static void getMallardDetails(Mallard mallard) {
        System.out.println("The mallard " + mallard.getName() + " flies at a speed of " + mallard.getFlightSpeed() + "mph.");
    }

    public static void main(String[] args) {
        System.out.println(multiple(5,6));
        System.out.println(multiple(8.5, 6.2));

        Mallard mallard1 = new Mallard("Gohan", 8, 25);
        getMallardDetails(mallard1);
    }
}
