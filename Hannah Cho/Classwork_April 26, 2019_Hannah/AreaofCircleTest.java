

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaofCircleTest
{
    @Test
    public void testMyMethod()
    {
        AreaofCircle a1 = new AreaofCircle();
        assertEquals(2, a1.getR(), 1);
        assertEquals(3.14, a1.getP(), 1);
        assertEquals(12.56, a1.getArea(8), 1);
        
    }
}
