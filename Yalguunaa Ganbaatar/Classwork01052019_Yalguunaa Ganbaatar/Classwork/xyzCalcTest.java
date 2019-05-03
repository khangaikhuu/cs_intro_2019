

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class xyzCalcTest
{
    @Test
    public void testXyzCalc()
    {
        xyzCalc q1 = new xyzCalc();
        assertEquals(false,q1.calcF(true,false,true));
       assertEquals(true,q1.calcF(true,true,true));
       assertEquals(false,q1.calcF(false,true,true));
    }
}
