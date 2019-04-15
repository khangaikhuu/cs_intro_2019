

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
      assertEquals(2, c1.calculateDivision(4,2));
      assertEquals(0, c1.calculateSubtraction(4,4));
      assertEquals(16, c1.calculateMultiplication(4,4));
      assertEquals(0, c1.calculateModulo(20,4));    
    }
}
