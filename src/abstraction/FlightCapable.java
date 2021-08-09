package abstraction;

public interface FlightCapable {

    public abstract void fly();

    public default void glide() {
        System.out.println("Does not glide");
    }
}