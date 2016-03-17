import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle rectangleWithEqualLengthWidth;
    Rectangle rectangleWithLengthHalfOfWidth;

    @Before
    public void setUp() throws Exception {
        rectangleWithEqualLengthWidth = new Rectangle(20, 20);
        rectangleWithLengthHalfOfWidth = new Rectangle(1.2, 2.4);
    }

    @Test
    public void rectangle_gives_area_when_length_width_are_same() throws Exception {
        assertEquals(400, rectangleWithEqualLengthWidth.calculateArea(), 0);
    }

    @Test
    public void rectangle_gives_area_when_length_half_of_width() throws Exception {
        assertEquals(2.88, rectangleWithLengthHalfOfWidth.calculateArea(), 0);
    }

    @Test
    public void rectangle_gives_perimeter_when_length_width_are_same() throws Exception {
        assertEquals(80, rectangleWithEqualLengthWidth.calculatePerimeter(), 0);
    }

    @Test
    public void rectangle_gives_perimeter_when_length_half_of_width() throws Exception {
        assertEquals(7.20, rectangleWithLengthHalfOfWidth.calculatePerimeter(), 0.1);
    }
}
