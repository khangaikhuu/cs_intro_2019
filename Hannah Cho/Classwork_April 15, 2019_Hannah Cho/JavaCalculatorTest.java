

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JavaCalculatorTest
{
    @Test
    public void testMyMethod()
    {
        JavaCalculator c1 = new JavaCalculator();
        assertEquals(5, c1.calculateAddition(2,3));
        assertEquals(9, c1.calculateAddition(6,3));
        assertEquals(1, c1.calculateSubtraction(4,3));
        assertEquals(8, c1.calculateSubtraction(9,1));
        assertEquals(3, c1.calculateMultiplication(3,1));
        assertEquals(8, c1.calculateMultiplication(4,2));
        assertEquals(2, c1.calculateDivision(4,2));
        assertEquals(3, c1.calculateDivision(9,3));
        assertEquals(1, c1.calculateModulo(3,2));
        assertEquals(1, c1.calculateModulo(5,4));
        
    }
    
}
