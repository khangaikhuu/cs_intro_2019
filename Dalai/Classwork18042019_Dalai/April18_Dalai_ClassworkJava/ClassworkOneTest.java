

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
    @Test
    public void testForLoop()
    {
        ClassworkOne cc = new ClassworkOne(10);
        assertEquals(55, cc.loop());
    }
}
