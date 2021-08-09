package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return super.length * super.length;
    }

    @Override
    public double getArea() {
        return 4 * super.length;
    }
}

//
//    public int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return 4 * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return side * side;
//    }

