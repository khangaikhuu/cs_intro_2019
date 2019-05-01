

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testThisMethod()
    {
      ClassworkTwo c1 = new ClassworkTwo(1, "Something", 2.3);
      assertEquals(1, c1.getI(1));
      assertEquals(2, c1.getI(2));
      assertEquals(4, c1.getI(4));
      assertEquals("something", c1.getS("something"));
      assertEquals("asdf", c1.getS("asdf"));
      assertEquals("nothing", c1.getS("nothing"));
      assertEquals(3.2, c1.getD(3.2), 0.1);
      assertEquals(1.1, c1.getD(1.1), 0.1);
      assertEquals(3.4, c1.getD(3.4), 0.1);
      assertEquals(45, c1.Something());
    }
}
