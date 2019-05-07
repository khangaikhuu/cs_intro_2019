

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkLoopTest
{
   @Test 
   public void testForLoop()
   {
       ClassworkLoop c1 = new ClassworkLoop();
       assertEquals(20, c1.loopNumbers(10));
    }
   
}
