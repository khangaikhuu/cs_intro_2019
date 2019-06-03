

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testThisMethod()
    {
      ClassworkTwo ct = new ClassworkTwo(1, "Hello", 1);
      assertEquals(1, ct.getA(1));
      assertEquals("Hello", ct.getB("Hello"));
      assertEquals(2, ct.getC(2), 1);
      assertEquals(11, ct.Hello());
    }
}
