
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
   @Test
   public void testMyMethod()
   {
       ClassworkOne c1 = new ClassworkOne(2);
       assertEquals(8, c1.getE(2, 3));
       assertEquals(27, c1.getE(3, 3));
       assertEquals(9, c1.getE(3, 2));
   }
}

