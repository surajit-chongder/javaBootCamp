public class InvalidScaleException extends Throwable {

    public InvalidScaleException(double length, double breadth) {
        super("Expected positive, but length = " + length + ", breadth = " + breadth + " are given");
    }
    public InvalidScaleException(double side) {
        super("Expected positive, but side = "+ side +" is given");
    }
}
