

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LessThanTest
{
       @Test
   public void testLessThan ()
   {
       LessThan lt = new LessThan();
       assertEquals(true, lt.getLessThan(3));
       assertEquals(true, lt.getLessThan(99));
       assertEquals(false, lt.getLessThan(333));
    }
}
