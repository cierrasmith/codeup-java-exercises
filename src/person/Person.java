package person;


public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public static final int MAX_FIRSTNAME_LENGTH = 50;

    public Person() {
        this("unknown", "unknown");
    }

    public Person(String firstName) {
        // call the 2-argument constructor using the keyword this
        // we do not call constructors inside the class itself using person.Person(...)
        // instead use this(...)
        this(firstName, "unknown");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String sayHello(){
        return "Hello my name is " + getFirstName() + " " + getLastName() + " and I am " + age + " years old.";
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public static String abbreviateFirstName(String firstName) {
        // static methods CANNOT use the keyword THIS
        // because static methods are used at the CLASS level
        // where you do not have an object instance.
        // THIS must be used with an object instance
        // this.firstName = firstName;

        return firstName.substring(0, 1);
    }

    public static void main(String[] args) {

    }

    // accessors

    public String getFirstName() {
        return firstName.toString();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}