public class Person {

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



    }
}
