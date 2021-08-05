public class Person {

    // 1. Object basics
    private String name;

    public Person(String name) {
        this.name = name;
    }

    //TODO: return the person's name
    public String getName(){
        return name;
    }

    //TODO: change the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    //TODO: print a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello from " + getName());
    }

    public static void main(String[] args) {

        Person cierra = new Person("Cierra");
        cierra.setName("Alora");
        cierra.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }
}
