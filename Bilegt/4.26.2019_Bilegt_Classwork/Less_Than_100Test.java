

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Less_Than_100Test
{
    @Test
    public void testThisMethod()
    {
        Less_Than_100 obj1 = new Less_Than_100();
        assertEquals(true, obj1.checkA(12));
        assertEquals(false, obj1.checkA(300));
        assertEquals(true, obj1.checkA(50));
    }
}
