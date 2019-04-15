

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest
{
    @Test
    public void testMyMethod()
    {
        Calculator c1 = new Calculator();
        assertEquals(9, c1.calculateAdd(4,5));
        assertEquals(-1, c1.calculateSubtract(4,5));
        assertEquals(2, c1.calculateDivide(10,5));
        assertEquals(20, c1.calculateMultiply(4,5));
        assertEquals(0, c1.calculateModulo(10,5));
        assertEquals(3, c1.calculateAdd(1,2));
        assertEquals(1, c1.calculateSubtract(2,1));
        assertEquals(2, c1.calculateDivide(2,1));
        assertEquals(2, c1.calculateMultiply(1,2));
        assertEquals(0, c1.calculateModulo(9,3));
    
    }
}
