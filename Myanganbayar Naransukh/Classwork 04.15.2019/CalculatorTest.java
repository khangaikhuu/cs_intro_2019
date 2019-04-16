

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
    @Test
    public void MyClculatorTest()
    {
        Calculator c1 = new Calculator();
        assertEquals(4, c1.calculateAddtion(2,2));
        assertEquals(10, c1.calculateAddtion(5,5));
        assertEquals(0, c1.calculateSubtraction(2,2));
        assertEquals(5, c1.calculateSubtraction(10,5));
        assertEquals(5, c1.calculateDivision(10,2));
        assertEquals(2, c1.calculateDivision(4,2));
        assertEquals(6, c1.calculateMultiplication(2,3));
        assertEquals(10, c1.calculateMultiplication(2,5));
        assertEquals(0, c1.calculateModulo(20,4));
    }
}
