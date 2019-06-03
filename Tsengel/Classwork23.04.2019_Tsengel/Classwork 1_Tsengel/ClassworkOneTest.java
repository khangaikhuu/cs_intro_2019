
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkOneTest
{
   @Test
   public void testClassworkOne()
   {
       ClassworkOne c1 = new ClassworkOne(12, "Tsengel");
       assertEquals(12, c1.getA());
       assertEquals("Tsengel", c1.getB());
       c1.setA(14);
       c1.setB("Hey");
       assertEquals(14, c1.getA());
       assertEquals("Hey", c1.getB());
       c1.setA(16);
       c1.setB("Yea");
       assertEquals(16, c1.getA());
       assertEquals("Yea", c1.getB());
    }
}
