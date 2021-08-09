package abstraction;

public class AnimalFarm {
    public static final int MAX_ANIMALS = 5;

    public static void main(String[] args) {

        Animal [] animals = new Animal[MAX_ANIMALS];
        animals[0] = new Pig("Wilbur");
        animals[1] = new Snake("Snakey");
        animals[2] = new Parakeet("Bob");
        animals[3] = new Chicken("Sue");
        animals[4] = new Duck("Tom");

//        for (int i = 0; i < animals.length; i++) {
//            System.out.printf("%s is a(n) %s and goes: ", animals[i].getAnimalName(), animals[i].getClass().getSimpleName());
//            animals[i].makeSound();
//
//            // if(animals[i] instanceof Snake) {
//            if(animals[i].getClass().getSimpleName().equals("Snake")) {
//                Snake tempSnake = (Snake) animals[i];
//                tempSnake.injectVenom();
//            }
//        }

        // Make the animals who can fly, fly
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof FlightCapable) { // are you flight capable?
                System.out.printf("I found a(n) %s that can fly: ", animals[i].getClass().getSimpleName());

                FlightCapable tempFlyer = (FlightCapable) animals[i];
                tempFlyer.fly();
                tempFlyer.glide();
            }
        }
    }
}