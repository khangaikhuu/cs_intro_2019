

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
    @Test
    public void testMyMethod()
    {
        ClassworkOne cc = new ClassworkOne(1, true, "Dalai");
        assertEquals(1, cc.getA());
        assertEquals(true, cc.getB());
        assertEquals("Dalai", cc.getC());
    }
}
