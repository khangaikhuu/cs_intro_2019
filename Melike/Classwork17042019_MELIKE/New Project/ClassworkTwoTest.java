

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkTwoTest
{
   @Test
  public void testMethod()
  {
      ClassworkTwo ct = new ClassworkTwo(32, 64);
      assertEquals(32, ct.getA(), 1);
      assertEquals(32, ct.setA (), 1);
      assertEquals(64, ct.getB (), 1);
      assertEquals(64, ct.setB (), 1);
   }
}
