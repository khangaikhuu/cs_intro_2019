

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SumTest
{
    @Test
   public void testSum ()
   {
       Sum s = new Sum();
       assertEquals(5050, s.getSum(), 1);
    }
}
