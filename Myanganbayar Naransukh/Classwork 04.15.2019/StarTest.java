

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StarTest
{
    @Test
    public void testMyMethod()
    {
        Star s1 = new Star();
        assertEquals(4, s1.getA());
        assertEquals(5, s1.getb());
        s1.setA(5);
        s1.setB(4);
        assertEquals(5, s1.getA());
        assertEquals(6, s1.getB());
    }
}