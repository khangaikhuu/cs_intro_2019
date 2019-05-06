

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BiggestTest
{
   @Test
   public void testBiggest ()
   {
       Biggest b = new Biggest();
       assertEquals(5, b.getBiggest(1, 5));
       assertEquals(8, b.getBiggest(5, 8));
       assertEquals(6, b.getBiggest(3, 6));
    }
}
