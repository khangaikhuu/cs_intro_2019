

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
    @Test
    public void testMyMethod()
    {
        Calculator t1 = new Calculator();
        assertEquals(9, t1.getSum(5,4));
        assertEquals(-1, t1.getDifference(3,4));
        assertEquals(12, t1.getProduct(3,4));
        assertEquals(2, t1.getQuotient(2,1));
        assertEquals(1, t1.getModulo(5,2));
        
    }
    public void testMyMethod2()
    {
        Calculator t2 = new Calculator();
        assertEquals(6, t2.getSum(3,3));
        assertEquals(2, t2.getDifference(9,7));
        assertEquals(40, t2.getProduct(10,4));
        assertEquals(3, t2.getQuotient(9,3));
        assertEquals(1, t2.getModulo(10,3));
    }
}
