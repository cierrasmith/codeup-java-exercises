package polymorphism;

// If you add final to a class, you cannot subclass
public class AnimalFarm {
    public static final int MAX_FARM_ANIMALS = 10; // Final cannot be changed later in the code

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeNoise();

        genericAnimal = new Goat();
        genericAnimal.makeNoise();

        genericAnimal = new Cat();
        genericAnimal.makeNoise();

        genericAnimal = new Piglet();
        genericAnimal.makeNoise();


//        Animal animal = new Animal();
//        animal.makeNoise();
//
//        Goat woodrow = new Goat();
//        woodrow.makeNoise();
//
//        Piglet piglet = new Piglet();
//        piglet.makeNoise();
//
//        Cat tabby = new Cat();
//        tabby.makeNoise();
    }
}
