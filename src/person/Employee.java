package person;

public class Employee extends Person {

    private String position;
    private long id;
    private double salary;

    //Constructor
    public Employee(String first, String last, int age) {
        super(first, last, age); // Super references the parent class (Person)
    }

    public Employee(String firstName, String lastName, int age, String position, long id, double salary) {
        super(firstName, lastName, age);
        this.position = position;
        this.id = id;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {  // use Command N to pull up this
        return "Employee{" +
                "position='" + position + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        Employee newEmployee = new Employee("Ry", "Sutton", 23, "Car washer", 1, 20000);

        Person personOne = new Person("Samuel", "Moore", 24);

        System.out.println(personOne.sayHello());
        System.out.println(newEmployee.getFirstName());
        System.out.println(newEmployee);
        System.out.println(newEmployee.sayHello());
    }

}
