package abstraction;

public abstract class Bird extends Animal implements FlightCapable {

    public Bird(String animalName) {
        super(animalName);
    }
}