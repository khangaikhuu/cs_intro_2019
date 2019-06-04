

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q9Test
{
     @Test
   public void testQ9 ()
   {
       Q9 lo = new Q9();
       assertEquals(true, lo.getResultt(true, true));
       assertEquals(false, lo.getResultt(true, false));
       assertEquals(true, lo.getResultt(false, false));
    }
}
