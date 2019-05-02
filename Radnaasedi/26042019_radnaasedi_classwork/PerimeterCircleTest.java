
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerimeterCircleTest
{
    @Test
    public void testPerimeterCircle()
    {
        PerimeterCircle a1 = new PerimeterCircle();
        assertEquals(12.56, a1.Perimeter(2), 1);
        assertEquals(6.28, a1.Perimeter(1), 1);
        assertEquals(25.12, a1.Perimeter(4), 1);
    }
}

