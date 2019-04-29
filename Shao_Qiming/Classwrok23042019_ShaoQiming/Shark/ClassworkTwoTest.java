

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
      assertEquals("something", c1.getS("something"));
      assertEquals(3.2, c1.getD(3.2), 0.1);
      assertEquals(50, c1.Something());
    }
}
