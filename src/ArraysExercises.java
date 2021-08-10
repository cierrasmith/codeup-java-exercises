import person.Person;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        Person[] people = new Person[3]; // a new array with 3 objects

        people[0] = new Person("Cierra");
        people[1] = new Person("Rob");
        people[2] = new Person("Alora");

        for (int i = 0; i < people.length; i += 1) {
            System.out.println(people[i].getFirstName());
        }

        people = addPerson(people, new Person("Gohan"));

        System.out.println("Array with added person");
        for(Person person : people) {
            System.out.println(person.getFirstName());
        }
    }

    // Create static method that accepts an array of Person objects
    public static Person[] addPerson(Person[] people, Person personObjToAdd) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);

        newPeople[newPeople.length - 1] = personObjToAdd; // Adds the person to the end of the array

        return newPeople;
    }
}
