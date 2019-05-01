

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyLoopTest
{
   @Test
   public void testMyLoop()
   {
       MyLoop s1 = new MyLoop();
       assertEquals(10, s1.fruityloops(1));
      
    }
}