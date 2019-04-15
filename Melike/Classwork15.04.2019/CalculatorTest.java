

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
       
       assertEquals(8, c1.getAddition(4,4));
       assertEquals(10, c1.getAddition(5,5));
       
       assertEquals(5, c1.getSubtraction(15,10));
       assertEquals(1, c1.getSubtraction(3,2));
       
       assertEquals(25, c1.getMultiplication(5,5));
       assertEquals(50, c1.getMultiplication(10,5));
       
       assertEquals(2, c1.getDivision(4,2));
       assertEquals(3, c1.getDivision(9,3));
       
       assertEquals(5, c1.getModulo(100,5));
       assertEquals(25, c1.getModulo(100,25));
    }
}
