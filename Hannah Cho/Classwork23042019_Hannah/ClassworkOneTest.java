

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test
    public void TestMyMethod()
    {
        ClassworkOne c1 = new ClassworkOne(12, "Hannah");
        assertEquals(12, c1.getA());
        assertEquals("Hannah", c1.getB());
        c1.setA(14);
        c1.setB("Cho");
        assertEquals(14, c1.getA());
        assertEquals("Cho", c1.getB());
        c1.setA(16);
        c1.setB("Kyunghae");
        assertEquals(16, c1.getA());
        assertEquals("Kyunghae", c1.getB());
    }
}
