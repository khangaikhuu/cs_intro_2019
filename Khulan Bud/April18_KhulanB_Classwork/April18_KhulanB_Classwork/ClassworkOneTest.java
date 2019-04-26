

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkOneTest
{
   @Test
   public void testClassworkOne()
   {
       ClassworkOne c1 = new ClassworkOne(10);
       assertEquals(10,c1.getA());
       c1.setA(20);
       assertEquals(20,c1.getA());
       assertEquals(400,c1.loopNumber(1));
    }
}
