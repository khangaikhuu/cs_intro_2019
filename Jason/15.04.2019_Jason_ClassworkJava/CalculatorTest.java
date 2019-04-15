

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
        assertEquals(8, c1.calculateAddition(4,4));
        assertEquals(2, c1.calculateDivision(10,5));
        assertEquals(10, c1.calculateMultiplication(10,1));
        assertEquals(7, c1.calculateSubtraction(10,3));
        assertEquals(0, c1.calculateModule(50,10));
        assertEquals(10, c1.calculateAddition(5,5));
        assertEquals(2, c1.calculateDivision(20,10));
        assertEquals(20, c1.calculateMultiplication(20,1));
        assertEquals(13, c1.calculateSubtraction(16,3));
        assertEquals(0, c1.calculateModule(2,2));
    }
}
