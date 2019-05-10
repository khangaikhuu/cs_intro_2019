

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterOfCircleTest
{
    @Test
    public void TestPerimeterOfCircle()
    {
        PerimeterOfCircle c1 = new PerimeterOfCircle();
        assertEquals(12.56, c1.Perimeter(2), 1);
        assertEquals(6.28, c1.Perimeter(1), 1);
        assertEquals(18.84, c1.Perimeter(3), 1);
    }
}
