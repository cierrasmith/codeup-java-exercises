package abstraction;

public class Pig extends Animal {

    public Pig(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Oink oink");
    }

}