

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q8Test
{
    @Test
    public void testmyCalculate()
    {
        Calculate q1 =  new Calculate();
        assertEquals(7, q1.Calculate(2,4,6));
        assertEquals(2, q1.Calculate(5,4,7));
        assertEquals(7, q1.Calculate(33,12,4));
    }
}
