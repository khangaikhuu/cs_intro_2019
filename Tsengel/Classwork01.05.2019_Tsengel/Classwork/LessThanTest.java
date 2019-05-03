
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LessThanTest
{
   @Test
   public void testLess()
   {
       LessThan l1 = new LessThan();
       assertEquals(true, l1.smaller(32,54));
       assertEquals(false, l1.smaller(369,37));
       assertEquals(true, l1.smaller(12,2));
    }
}
