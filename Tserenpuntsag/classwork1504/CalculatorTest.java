

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
       assertEquals (6, c1.calculateAdd(1, 5));
       assertEquals (7, c1.calculateAdd(4,3));
       assertEquals (0, c1.calculateSubtract(5,5));
       assertEquals (5, c1.calculateSubtract(6,1));
       assertEquals (5, c1.calculateDivision(10,2));
       assertEquals (3, c1.calculateDivision(9,3));
       assertEquals (5, c1.calculateMultiply(1,5));
       assertEquals (6, c1.calculateMultiply(2,3));
       assertEquals (0, c1.calculateModulo(10, 5));
       assertEquals (0, c1.calculateModulo(9, 3));
       
    }
   
}
