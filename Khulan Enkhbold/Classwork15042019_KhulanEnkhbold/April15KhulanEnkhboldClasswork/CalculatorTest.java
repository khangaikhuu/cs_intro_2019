

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
        assertEquals(8, s1.getAddition(4,4));
        assertEquals(10, s1.getAddition(5,5));
        assertEquals(2, s1.getSubtraction(6,4));
        assertEquals(1, s1.getSubtraction(5,4));
        assertEquals(2, s1.getMultiplication(2,1));
        assertEquals(9, s1.getMultiplication(3,3));
        assertEquals(3, s1.getDivision(9,3));
        assertEquals(2, s1.getDivision(6,3));
        assertEquals(0, s1.getModulo(6,2));
        assertEquals(1, s1.getModulo(5,2));
    } 
  
}
