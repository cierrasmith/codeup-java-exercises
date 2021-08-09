package abstraction;

public class Snake extends Animal {

    public Snake(String animalName) {
        super(animalName);
    }

    @Override
    public void walk() {
        System.out.println("Slowly slithers");
    }

    @Override
    public void makeSound() {
        System.out.println("Hisssss");
    }

    public void injectVenom() {
        System.out.println("Heading to the hospital");
    }
}
