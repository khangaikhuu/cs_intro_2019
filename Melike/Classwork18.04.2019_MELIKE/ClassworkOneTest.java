

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
   @Test
  public void testMethod()
  {
      ClassworkOne co = new ClassworkOne();
      assertEquals(4, co.setM(2), 1);
      assertEquals(6, co.setM(3), 1);
      assertEquals(8, co.setM(4), 1);
  }
}
