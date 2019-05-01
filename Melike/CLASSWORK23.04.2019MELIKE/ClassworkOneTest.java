

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
   @Test
    public void testClassworkOne()
    {
        ClassworkOne co = new ClassworkOne(1, "Melike");
        assertEquals(1, co.getA());
        assertEquals("Melike", co.getB());
    }
}
