

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
    @Test
    public void testClassworkOne()
    {
        ClassworkOne c1 = new ClassworkOne(0, true, "Hi");
        assertEquals(0, c1.getA());
        assertEquals(true, c1.getB());
        assertEquals("Hi", c1.getC());
    }
    
}
