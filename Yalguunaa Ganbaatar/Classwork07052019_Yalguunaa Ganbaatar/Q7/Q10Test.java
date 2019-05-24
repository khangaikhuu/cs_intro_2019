

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test; 

public class Q10Test
{
   @Test
   public void testQ10()
   {
       Q10 t = new Q10();
       assertEquals(true, t.findMyElement(12.3));
       assertEquals(false, t.findMyElement(3.3));
       assertEquals(true, t.findMyElement(2.5));
    }
}
