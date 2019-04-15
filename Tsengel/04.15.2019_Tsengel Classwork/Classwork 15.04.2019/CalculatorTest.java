
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
        assertEquals(10, c1.calculateAddition(5,5));
        assertEquals(6, c1.calculateSubtraction(8,2));
        assertEquals(8, c1.calculateSubtraction(10,2));
        assertEquals(9, c1.calculateMultiplication(9,1));
        assertEquals(4, c1.calculateMultiplication(2,2));
        assertEquals(2, c1.calculateDivision(10,5));
        assertEquals(1, c1.calculateDivision(8,8));
        assertEquals(0, c1.calculateModule(50,10)); 
        assertEquals(0, c1.calculateModule(2,2));                 
    }
}
