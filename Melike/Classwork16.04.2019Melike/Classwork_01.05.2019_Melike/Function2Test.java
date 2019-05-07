

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Function2Test
{
     @Test
   public void testFunction2 ()
   {
       Function2 f2 = new Function2();
       assertEquals(false, f2.getFunction2(true, false, false));
       assertEquals(true, f2.getFunction2(false, false, false));
       assertEquals(true, f2.getFunction2(true, true, true));
    }
}
