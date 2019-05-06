

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LawOfRelativityTest
{
   @Test
   public void testLawOfRelativity ()
   {
       LawOfRelativity lor = new LawOfRelativity();
       assertEquals(4, lor.getLawOfRelativity(1, 2), 1);
       assertEquals(18, lor.getLawOfRelativity(2, 3), 1);
       assertEquals(48, lor.getLawOfRelativity(3, 4), 1);
    }
}
