/*
    job - calculate Area and Perimeter
 */
public class Rectangle implements Quadrilateral {
    private final double length;
    private final double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle create(double length, double breadth) throws InvalidScaleException {
        if (length <= 0 || breadth <= 0)
            throw new InvalidScaleException(length, breadth);
        return new Rectangle(length, breadth);
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
