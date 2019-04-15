

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest
{
    @Test
    public void testMyMethod()
    {
        Calculator s1 = new Calculator();
        assertEquals(7, s1.calculateAddition(3, 4));
        assertEquals(10, s1.calculateAddition(3, 7));
        
        assertEquals(7, s1.calculateSubstraction(10, 3));
        assertEquals(10, s1.calculateSubstraction(20, 10));
        
        assertEquals(5, s1.calculateDivision(10, 2));
        assertEquals(10, s1.calculateDivision(20, 2));
        
        assertEquals(7, s1.calculateMultiplication(7, 1));
        assertEquals(10, s1.calculateMultiplication(5, 2));
        
        assertEquals(4, s1.calculateModula(4, 5));
        assertEquals(2, s1.calculateModula(10, 4));
    }
}
