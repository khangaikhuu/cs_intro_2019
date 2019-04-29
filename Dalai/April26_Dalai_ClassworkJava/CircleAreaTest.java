import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CircleAreaTest
{
    @Test
    public void testMyMethod()
    {
        CircleArea c1 = new CircleArea();
        assertEquals(12.56, c1.getA(2), 1);
        assertEquals(28.26, c1.getA(3), 1);
        assertEquals(50.24, c1.getA(4), 1);
    }
}
