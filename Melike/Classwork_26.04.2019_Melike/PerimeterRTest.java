

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterRTest
{
     @Test
   public void testPerimeterR ()
   {
       PerimeterR pr = new PerimeterR();
       assertEquals(16, pr.getPerimeterR(5, 3), 1);
       assertEquals(24, pr.getPerimeterR(10, 2), 1);
       assertEquals(14, pr.getPerimeterR(3, 4), 1);
    }
}
