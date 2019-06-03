

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BiggestTest
{
   @Test
   public void testBiggest()
   {
       Biggest q1 = new Biggest();
       assertEquals(2,q1.Big(2,1));
       assertEquals(10,q1.Big(4,10));
       assertEquals(7,q1.Big(7,3));
    }
}
