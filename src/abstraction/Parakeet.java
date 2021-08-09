package abstraction;

public class Parakeet extends Bird {
    public Parakeet(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet tweet");
    }

    @Override
    public void fly() {
        System.out.println("Flies pretty fast");
    }
}