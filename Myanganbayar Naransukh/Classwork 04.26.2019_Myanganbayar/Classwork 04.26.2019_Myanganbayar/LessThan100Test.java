

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LessThan100Test
{
    @Test
    public void testThisMethod()
    {
        LessThan100 obj1 = new LessThan100();
        assertEquals(true, obj1.checkA(12));
        assertEquals(true, obj1.checkA(80));
        assertEquals(false, obj1.checkA(111));
    }
}
