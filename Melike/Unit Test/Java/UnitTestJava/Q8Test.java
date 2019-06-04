

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q8Test
{
   @Test
   public void testQ8 ()
   {
       Q8 lo = new Q8();
       assertEquals(81, lo.getResult(5, 8));
       assertEquals(61, lo.getResult(4, 7));
       assertEquals(45, lo.getResult(3, 6));
    }
}
