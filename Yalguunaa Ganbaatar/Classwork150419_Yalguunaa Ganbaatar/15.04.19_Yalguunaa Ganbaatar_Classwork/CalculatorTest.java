

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
       assertEquals(5, c1.getAddition(3,2));
       assertEquals(1, c1.getSubtraction(5,4));
       assertEquals(6, c1.getMultiplication(3,2));
       assertEquals(2, c1.getDivison(8,4));
       assertEquals(3, c1.getModulo(3,4));
       assertEquals(9, c1.getAddition(6,3));
       assertEquals(3, c1.getSubtraction(5,2));
       assertEquals(2, c1.getMultiplication(1,2));
       assertEquals(2, c1.getDivison(4,2));
       assertEquals(1, c1.getModulo(5,4));
    }
}
