

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyLoopTest
{
     @Test
   public void testMyMethod()
   {
       MyLoop ml = new MyLoop();
       assertEquals(40, ml.getLoop(40, 4));
    }
}
