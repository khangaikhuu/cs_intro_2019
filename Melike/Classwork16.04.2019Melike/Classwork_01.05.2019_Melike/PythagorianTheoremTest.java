

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PythagorianTheoremTest
{
    @Test
   public void testPythagorianTheorem ()
   {
       PythagorianTheorem pt = new PythagorianTheorem();
       assertEquals(2.23, pt.getPythagorianTheorem(1, 2), 2);
       assertEquals(3.60, pt.getPythagorianTheorem(2, 3), 1);
       assertEquals(5, pt.getPythagorianTheorem(3, 4), 1);
    }
}
