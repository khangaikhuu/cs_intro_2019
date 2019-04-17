

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
    @Test
    public void testgetI()
    {
        ClassworkOne e1 = new ClassworkOne(3, true, "Lola");
        assertEquals(3, e1.getI(3));
        assertEquals(true, e1.getB(true));
        assertEquals("Lola", e1.getS("Lola"));
    }
}
