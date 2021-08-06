package shapes;

public class Square extends Rectangle {

    public int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        return 4 * side;
    }

    @Override
    public double getPerimeter() {
        return side * side;
    }
}
