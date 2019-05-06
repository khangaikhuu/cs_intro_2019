

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EqualTest
{
    @Test
   public void testEqual ()
   {
       Equal e = new Equal();
       assertEquals(true, e.getEqual(5, 5));
       assertEquals(false, e.getEqual(5, 8));
       assertEquals(false, e.getEqual(3, 6));
    }
}
