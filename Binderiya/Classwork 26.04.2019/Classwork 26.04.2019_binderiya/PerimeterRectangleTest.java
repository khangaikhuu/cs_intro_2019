import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerimeterRectangleTest
{
    @Test
    public void PerimeterRectangle()
    {
       PerimeterRectangle p1 = new PerimeterRectangle();
       assertEquals(6, p1.PerimeterRectangle(1,2));
       assertEquals(10, p1.PerimeterRectangle(2,3));
       assertEquals(14, p1.PerimeterRectangle(3,4));
    }
}
