

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
       assertEquals(8, c1.calculateAddition(4, 4));
       assertEquals(2, c1.calculateAddition(1, 1));
       assertEquals(3, c1.calculateSubtraction(7, 4));
       assertEquals(5, c1.calculateSubtraction(10, 5));
       assertEquals(2, c1.calculateDivision(4, 2));
       assertEquals(4, c1.calculateDivision(8,2));
       assertEquals(8, c1.calculateMultiplication(4, 2));
       assertEquals(10, c1.calculateMultiplication(5, 2));
       assertEquals(1, c1.calculateModulo(5, 2));
       assertEquals(0, c1.calculateModulo(4, 2));
    }
}
