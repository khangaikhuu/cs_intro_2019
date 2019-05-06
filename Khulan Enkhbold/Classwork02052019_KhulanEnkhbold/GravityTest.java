

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GravityTest
{
   @Test
   public void testThisMethod()
   {
       Gravity c1 = new Gravity();
       assertEquals(7.415644444444443, c1.calcGravity(1000000000, 10000000, 300), 0.00000001);
       assertEquals(1.186503111111111, c1.calcGravity(120000000, 120000000, 900), 0.00000001);
       assertEquals(0.8618392738946818, c1.calcGravity(20000005, 20000005, 176), 0.00000001);
    }
    
}
