
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkTwoTest
{
   @Test
   public void testTwo()
   {
       ClassworkTwo c = new ClassworkTwo(16, 32);
       assertEquals(16, c.getA(), 1);
       assertEquals(16, c.setA(), 1);
       assertEquals(32, c.getB(), 1);
       assertEquals(32, c.setB(), 1);
    }
}
