package abstraction;

public class Chicken extends Animal implements FlightCapable {

    // requiring sub-classes to have same implementation of a super class constructor is stupid
    public Chicken(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck cluck");
    }

    @Override
    public void fly() {
        System.out.println("Flies a little");
    }
}