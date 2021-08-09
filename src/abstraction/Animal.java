package abstraction;

public abstract class Animal {

    public void walk() {
        System.out.println("Walks around a bit");
    }

    public final void breathe(int numSeconds) {
        System.out.println("Breathes for " + numSeconds + " seconds.");
    }

    public abstract void makeSound();

}
