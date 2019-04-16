

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
        assertEquals(9, c1.calculateAddition(4, 5));
        assertEquals(15, c1.calculateAddition(10, 5));
        assertEquals(3, c1.calculateSubtraction(7, 4));
        assertEquals(69, c1.calculateSubtraction(78, 9));
        assertEquals(3, c1.calculateDivision(9, 3));
        assertEquals(4, c1.calculateDivision(16, 4));
        assertEquals(9, c1.calculateMultiplication(3, 3));
        assertEquals(100, c1.calculateMultiplication(10, 10));
        assertEquals(1, c1.calculateModulo(5, 2));
        assertEquals(1, c1.calculateModulo(6, 5));
    }
}
