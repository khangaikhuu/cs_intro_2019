

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Check100Test
{
   @Test
   public void testCheck100()
   {
       Check100 c1 = new Check100();
       assertEquals(true, c1.check100(50));
       assertEquals(false, c1.check100(150));
       assertEquals(true, c1.check100(75));
    }
}
