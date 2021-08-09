package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Rectangle(4, 5);
        System.out.println("The perimeter of the rectangle is: " + myShape.getPerimeter());
        System.out.println("The area of the rectangle is: " + myShape.getArea());

        myShape = new Square(5);
        System.out.println("The perimeter of the square: " + myShape.getPerimeter());
        System.out.println("The area of the square: " + myShape.getArea());

//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5); // Polymorphism
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}
