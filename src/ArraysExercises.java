import person.Person;

public class ArraysExercises {

    public static void main(String[] args) {

        Person[] people = new Person[3];

        people[0] = new Person("Cierra");
        people[1] = new Person("Rob");
        people[2] = new Person("Alora");

        for (int i = 0; i < people.length; i += 1) {

            System.out.println(people[i]);
        }
    }
}
