

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
    @Test
    public void testClassworkOne()
    {
        ClassworkOne c1 = new ClassworkOne(4, true, "bye");
        assertEquals(4, c1.getFit(4));
        assertEquals(true, c1.getGreen(true));
        assertEquals("bye", c1.getFood("bye"));
    }
}