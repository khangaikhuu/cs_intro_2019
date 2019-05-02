

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test
    public void testOne()
    {
        ClassworkOne C1 = new ClassworkOne(2,"yo");
        assertEquals (2, C1.getA());
        assertEquals ("yo", C1.getB());
        C1.setA(3);
        assertEquals (3, C1.getA());
        C1.setB("kk");
        assertEquals ("kk", C1.getB());
        C1.setA(5);
        assertEquals (5, C1.getA());
        C1.setB("mm");
        assertEquals ("mm", C1.getB());
    }
}
