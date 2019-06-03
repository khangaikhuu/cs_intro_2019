

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SubtractionTest
{
      @Test
   public void testSubtraction ()
   {
       Subtraction s = new Subtraction();
       assertEquals(2, s.getSubtraction(5, 3), 1);
       assertEquals(4, s.getSubtraction(10, 6), 1);
       assertEquals(4, s.getSubtraction(7, 3), 1);
    }
}
