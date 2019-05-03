
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PythagorianTheoremTest
{
   @Test
   public void testPythagorian()
   {
       PythagorianTheorem t1 = new PythagorianTheorem();
       assertEquals(4.47, t1.getC(2, 4), 1);
       assertEquals(5.0, t1.getC(3, 4), 1);
       assertEquals(12.04, t1.getC(8, 9), 1);
    }
}
