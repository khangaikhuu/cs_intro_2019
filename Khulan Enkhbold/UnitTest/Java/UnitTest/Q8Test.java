

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q8Test
{
   @Test
   public void q8()
   {
       Q8 a1 = new Q8();
       assertEquals(-6,a1.calculate(3,2));
       assertEquals(-4,a1.calculate(2,3));
       assertEquals(50,a1.calculate(5,12));
    }
}
