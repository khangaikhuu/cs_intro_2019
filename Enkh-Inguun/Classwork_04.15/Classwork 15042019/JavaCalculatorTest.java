

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
         assertEquals(9, c1.calculateAddition(4, 5));
         assertEquals(8, c1.calculateAddition(4, 4));
         assertEquals(3, c1.calculateSubrtraction(7, 4));
         assertEquals(5, c1.calculateSubrtraction(10, 5));
         assertEquals (3, c1.calculateDivision(9, 3));
         assertEquals(4, c1.calculateDivision(8, 2));
         assertEquals(10, c1.calculateMultiplicatin(2, 5));
         assertEquals(1, c1.calculateMultiplicatin(1, 1));
         assertEquals(7, c1.calculateModula(7, 8));
         assertEquals(2, c1.calculateModula(2, 5));
     
    }
     
}
