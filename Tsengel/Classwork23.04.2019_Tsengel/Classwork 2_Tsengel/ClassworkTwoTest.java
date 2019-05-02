
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkTwoTest
{
   @Test
   public void testClassworkTwo()
   {
       ClassworkTwo c2 = new ClassworkTwo(1, "Tsengel" , 2.4);
       assertEquals(1, c2.getA());
       assertEquals("Tsengel", c2.getB());
       assertEquals(2.4, c2.getC(), 1);
       assertEquals(20, c2.loopNumbers(20));
    }
}

