

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
        assertEquals(1, c1.calculateSubtraction(4,3));
        assertEquals(3, c1.calculateMultiplication(3,1));
        assertEquals(2, c1.calculateDivision(4,2));
        assertEquals(1, c1.calculateModulo(3,2));
        
    }
    
}
