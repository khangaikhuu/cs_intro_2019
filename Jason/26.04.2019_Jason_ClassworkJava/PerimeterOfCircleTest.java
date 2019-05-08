import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerimeterOfCircleTest
{
    @Test
    public void testaPerimeterCircle()
    {
        PerimeterOfCircle a1 = new PerimeterOfCircle();
        assertEquals(12.56, a1.perimeter(2), 1);
        assertEquals(6.28, a1.perimeter(1), 1);
        assertEquals(25.12, a1.perimeter(4), 1);
    }
}
