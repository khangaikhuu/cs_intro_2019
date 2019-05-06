

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GravityTest
{
   @Test
   public void testGravity()
   {
       Gravity q1 = new Gravity();
       assertEquals(2.669036E-10,q1.calcGravity(2,2,1),1);
       assertEquals(6.67259E-11,q1.calcGravity(2,3,2),1);
       assertEquals(2.669036E-10,q1.calcGravity(10,4,3),1);
    }
}
