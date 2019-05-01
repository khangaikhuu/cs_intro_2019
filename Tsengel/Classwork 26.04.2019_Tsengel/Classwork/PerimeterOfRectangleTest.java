
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerimeterOfRectangleTest
{
    @Test
    public void testAreaQuadrat()
    {
       PerimeterOfRectangle a2 = new PerimeterOfRectangle();
        assertEquals(20, a2.Perimeter(3,7));
        assertEquals(6, a2.Perimeter(1,2));
        assertEquals(16, a2.Perimeter(4,4));
    }
}
