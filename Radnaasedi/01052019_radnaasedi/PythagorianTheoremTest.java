

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PythagorianTheoremTest
{
    
    @Test
    public void testPythagorianTheorem()
    {
        PythagorianTheorem q1 = new PythagorianTheorem();
        assertEquals(2.82842712474619031,q1.PythagorianTheorem(2,2),1);
        assertEquals(23.345235059857504,q1.PythagorianTheorem(4,23),1);
        assertEquals(10.04987562112089,q1.PythagorianTheorem(10,1),1);
    }
}
