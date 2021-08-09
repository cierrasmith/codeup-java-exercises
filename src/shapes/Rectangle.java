package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

//    private int width;
//    private int length;
//
//    public Rectangle(int width, int length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return 2 * length + 2 * width;
//    }
//
//    // Accessors
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }

