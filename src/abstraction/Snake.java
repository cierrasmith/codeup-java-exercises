package abstraction;

public class Snake extends Animal {

    @Override
    public void walk() {
        System.out.println("Slowly slithers");
    }

    @Override
    public void makeSound() {
        System.out.println("Hissss");
    }

    public void injectVenom() {
        System.out.println("Heading the hospital");
    }
}
