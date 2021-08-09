package abstraction;

public class Duck extends Animal implements FlightCapable {

    public Duck(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack quack");
    }

    @Override
    public void fly() {
        System.out.println("Flies nicely");
    }

    @Override
    public void glide() {
        System.out.println("Glides pretty well");
    }
}