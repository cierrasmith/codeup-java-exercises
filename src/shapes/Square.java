package shapes;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        double side = super.getWidth();
        return 4 * side;
    }

    @Override
    public double getPerimeter() {
        double side = super.getLength();
        return side * side;
    }
}
