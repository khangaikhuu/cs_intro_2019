import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkTwoTest
{
   @Test
   public void testTwo()
   {
       ClassworkTwo c = new ClassworkTwo(2.2f, 3.2);
       assertEquals(2.2f, c.getA(), 1);
       assertEquals(3.2f, c.getA(), 1);
       c.setA(3.4f);
       c.setb(3.5f);
       assertEquals(3.4f, c.getB(), 1);
       assertEquals(3.5, c.getB(), 1);
   }
}
