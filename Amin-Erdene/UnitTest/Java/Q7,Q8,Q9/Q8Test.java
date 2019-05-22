

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q8Test
{
   @Test
   public void Q8()
   {
       Q8 a1 = new Q8();
       assertEquals(12, a1.calculate(3,2));
       assertEquals(8, a1.calculate(2,3));
       assertEquals(192, a1.calculate(12,5));
    }
}
