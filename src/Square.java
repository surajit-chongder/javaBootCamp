/*
    job - calculate Area and Perimeter
 */
public class Square implements Quadrilateral{
    private final double side;

    private Square(double side) {
        this.side = side;
    }

    public static Square create(double side) throws InvalidScaleException {
        if (side <= 0)
            throw new InvalidScaleException(side);
        return new Square(side);
    }
    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
