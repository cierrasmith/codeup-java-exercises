package practice;

public class Mallard extends Duck implements Quackable{

    private int flightSpeed;

    public Mallard(String name, int age, int flightSpeed) {
        super(name, age);
        this.flightSpeed = flightSpeed;
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    @Override
    public void Quack() {
        System.out.println("Quack!");
    }
}
