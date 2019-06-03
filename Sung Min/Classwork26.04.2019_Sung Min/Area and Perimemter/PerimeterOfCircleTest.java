import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterOfCircleTest
{
    @Test
    public void testPerimeterCircle()
    {
        PerimeterOfCircle p = new PerimeterOfCircle();
        assertEquals(12.56, p.Perimeter(2), 1);
        assertEquals(6.28, p.Perimeter(1), 1);
        assertEquals(25.12, p.Perimeter(4), 1);
    }
}
