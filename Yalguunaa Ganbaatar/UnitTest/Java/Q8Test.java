

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q8Test
{
   @Test
   public void testQ8()
   {
       Q8 t = new Q8();
       assertEquals(6, t.calc(2,2));
       assertEquals(15, t.calc(3,3));
       assertEquals(86, t.calc(12,2));
    }
}
