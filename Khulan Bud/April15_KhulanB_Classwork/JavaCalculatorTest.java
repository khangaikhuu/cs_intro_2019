

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
       assertEquals(5, c1.calculateAddition(3,2));
       assertEquals(1, c1.calculateSubtraction(3,2));
       assertEquals(6, c1.calculateMultiplication(3,2));
       assertEquals(5, c1.calculateDivision(10,2));
       assertEquals(1, c1.calculateModulo(3,2));
       
      
       assertEquals(4, c1.calculateAddition(2,2));
       assertEquals(4, c1.calculateSubtraction(6,2));
       assertEquals(16, c1.calculateMultiplication(4,4));
       assertEquals(2, c1.calculateDivision(4,2));
       assertEquals(1, c1.calculateModulo(4,3));
    }
}
