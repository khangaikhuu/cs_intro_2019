import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testThisMethod()
    {
      ClassworkTwo c2 = new ClassworkTwo(1, "Melike", 1);
      assertEquals(1, c2.getA(1));
      assertEquals(2, c2.getA(2));
      assertEquals(4, c2.getA(4));
      assertEquals("melike", c2.getB("melike"));
      assertEquals("abc", c2.getB("abc"));
      assertEquals("xyz", c2.getB("xyz"));
      assertEquals(1, c2.getD(1), 0.1);
      assertEquals(5, c2.getD(5), 0.1);
      assertEquals(0, c2.getD(0), 0.1);
    }
}
