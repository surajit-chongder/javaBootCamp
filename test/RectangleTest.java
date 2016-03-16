import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void rectangle_gives_area_when_length_width_are_same() throws Exception {
        Rectangle rectangle = new Rectangle(20, 20);
        assertEquals(400, rectangle.calculateArea(), 0);
    }

    @Test
    public void rectangle_gives_area_when_length_half_of_width() throws Exception {
        Rectangle rectangle = new Rectangle(1.2, 2.4);
        assertEquals(2.88, rectangle.calculateArea(), 0);
    }

    @Test
    public void rectangle_gives_perimeter_when_length_width_are_same() throws Exception {
        Rectangle rectangle = new Rectangle(20, 20);
        assertEquals(80, rectangle.calculatePerimeter(), 0);
    }

    @Test
    public void rectangle_gives_perimeter_when_length_half_of_width() throws Exception {
        Rectangle rectangle = new Rectangle(1.2, 2.4);
        assertEquals(7.20, rectangle.calculatePerimeter(), 0.1);
    }
}
