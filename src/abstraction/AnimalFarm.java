package abstraction;

public class AnimalFarm {
    public static final int MAX_ANIMALS = 5;

    public static void main(String[] args) {
        Animal animal;

        Pig wilbur = new Pig();
        wilbur.walk();
        wilbur.breathe(5);
        wilbur.makeSound();

        animal = new Snake();
        animal.walk();
        animal.breathe(5);
        animal.makeSound();

        Snake tom = new Snake(); // had to create a new snake and not animal in order to pull injectVenom. There is no injectVenom method in Animal.java
        tom.injectVenom();
    }
}
