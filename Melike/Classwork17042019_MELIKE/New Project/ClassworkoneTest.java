

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkoneTest
{
  @Test
  public void testMethod()
  {
      Classworkone co = new Classworkone(4, true, "hello");
      assertEquals(4, co.getA ());
      assertEquals(true, co.getB ());
      assertEquals("hello", co.getC ());
  }
}
