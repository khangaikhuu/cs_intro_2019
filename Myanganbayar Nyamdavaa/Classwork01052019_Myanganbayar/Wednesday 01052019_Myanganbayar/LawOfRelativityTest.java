

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LawOfRelativityTest
{
   @Test
   public void testMyMethod()
   {
       LawOfRelativity c1 = new LawOfRelativity();
       assertEquals(8.987551787, c1.relativity(0.0000000000000001), 0.00000001);
       assertEquals(17.97510357, c1.relativity(0.0000000000000002), 0.00000001);
       assertEquals(26.96265536, c1.relativity(0.0000000000000003), 0.00000001);
   }
}
