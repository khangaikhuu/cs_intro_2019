

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkThreeTest
{
    @Test
    public void testForLoop()
    {
        ClassworkThree cc = new ClassworkThree(8);
        assertEquals(55, cc.loop());
    }
}
