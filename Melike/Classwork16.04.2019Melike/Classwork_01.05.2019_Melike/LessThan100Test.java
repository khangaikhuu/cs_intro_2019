

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LessThan100Test
{
     @Test
   public void testLessThan100 ()
   {
       LessThan100 e = new LessThan100();
       assertEquals(true, e.getLessThan100(5, 5));
       assertEquals(true, e.getLessThan100(5, 8));
       assertEquals(true, e.getLessThan100(3, 6));
    }
}
