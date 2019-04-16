

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
<<<<<<< HEAD
        //assertEquals(5, s1.getb());
=======
        assertEquals(5, s1.getB());
>>>>>>> 894147eac0aa38a3977d01e902f19d8848431bd7
        s1.setA(5);
        s1.setB(6);
        assertEquals(5, s1.getA());
        assertEquals(6, s1.getB());
    }
}