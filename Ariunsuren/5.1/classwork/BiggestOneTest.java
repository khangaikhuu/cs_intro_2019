

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BiggestOneTest
{
    @Test
   public void testBiggest()
   {
       BiggestOne c1 = new BiggestOne();
       assertEquals(2,c1.BiggerNumber(2,1));
       assertEquals(4,c1.BiggerNumber(4,2));
       assertEquals(5,c1.BiggerNumber(5,3));
    }
}
