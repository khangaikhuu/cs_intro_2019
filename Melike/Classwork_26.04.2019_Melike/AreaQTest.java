

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AreaQTest
{
    @Test
   public void testAreaQ ()
   {
       AreaQ aaaq = new AreaQ();
       assertEquals(25, aaaq.getAreaQ(5), 1);
       assertEquals(100, aaaq.getAreaQ(10), 1);
       assertEquals(28.26, aaaq.getAreaQ(3), 1);
    }
}
