

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class calculateNotTest
{
    @Test
    public void testNot()
    {
        calculateNot cn = new calculateNot();
        assertEquals(false, cn.Not(true, true, false));
        assertEquals(true, cn.Not(false, false, true));
        assertEquals(false, cn.Not(false, true, false));
    }
}
