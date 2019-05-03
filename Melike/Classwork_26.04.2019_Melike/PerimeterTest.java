

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterTest
{
    @Test
   public void testPerimeter ()
   {
       Perimeter ppp = new Perimeter();
       assertEquals(6.28, ppp.getPerimeter(1), 1);
       assertEquals(31.4, ppp.getPerimeter(5), 1);
       assertEquals(18.84, ppp.getPerimeter(3), 1);
    }
}
