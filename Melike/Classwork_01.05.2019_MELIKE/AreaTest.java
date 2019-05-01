

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaTest
{
   @Test
   public void testArea ()
   {
       Area aaa = new Area();
       assertEquals(3.14, aaa.getArea(1), 1);
       assertEquals(78.5, aaa.getArea(5), 1);
       assertEquals(28.26, aaa.getArea(3), 1);
    }
}
