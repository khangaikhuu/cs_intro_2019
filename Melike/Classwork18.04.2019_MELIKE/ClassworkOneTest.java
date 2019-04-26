

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
      assertEquals(1, co.setM(1), 1);
      assertEquals(2, co.setM(2), 1);
  }
}
