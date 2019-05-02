

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PythagorianTheoremTest
{
    @Test 
    public void testMyMethod()
    {
        PythagorianTheorem p1 = new PythagorianTheorem();
        assertEquals(4.123105625617661,p1.getC(8,9), 1);
        assertEquals(4.0,p1.getC(9,7), 1);
        assertEquals(4.898979485566356,p1.getC(11,13), 1);
    }

}
