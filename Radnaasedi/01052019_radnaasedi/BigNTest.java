

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BigNTest
{
    @Test
   public void testBigN()
   {
       BigN q1 = new BigN();
       assertEquals(2,q1.BigN(2,1));
       assertEquals(10,q1.BigN(4,10));
       assertEquals(7,q1.BigN(7,3));
    }
}
