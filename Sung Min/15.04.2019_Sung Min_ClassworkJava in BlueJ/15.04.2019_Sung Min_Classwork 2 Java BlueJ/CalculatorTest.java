

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
        assertEquals(10, c1.add(5,5));
        assertEquals(12, c1.add(6,6));
        
        assertEquals(0, c1.subtract(4,4));
        assertEquals(2, c1.subtract(4,2));
        
        assertEquals(16, c1.multiply(4,4));
        assertEquals(12, c1.multiply(2,6));
        
        assertEquals(2, c1.division(4,2));
        assertEquals(3, c1.division(9,3));
        
        assertEquals(0, c1.modulo(2,2));
        assertEquals(0, c1.modulo(5,5));
    }
    
}
