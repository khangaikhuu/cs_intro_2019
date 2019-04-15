

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JavaCalculatorTest
{
    @Test 
    public void testMyMethod()
    {
        JavaCalculator c1 = new JavaCalculator ();
        assertEquals(3, c1.calculateAddition(1,2));
        assertEquals(6, c1.calculateSubtraction(9,3));
        assertEquals(8, c1.calculateMultiplication(4,2));
        assertEquals(2, c1.calculateDivision(4,2));
        assertEquals(1, c1.calculateModulo(3,2));
       
        
       
    }
        
    
    
}
