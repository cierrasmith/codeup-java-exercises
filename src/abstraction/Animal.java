package abstraction;

public abstract class Animal {
    protected String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void walk() {
        System.out.println("Walks around a bit");
    }

    public final void breathe(int numSeconds) {
        System.out.println("Breathes for " + numSeconds + " seconds");
    }

    public abstract void makeSound();

    // accessors

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}