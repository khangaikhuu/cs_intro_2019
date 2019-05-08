import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CalculateSubtrationTest
{
   @Test
   public void testcalcSubtraction()
   {
       CalculateSubtraction a2 = new CalculateSubtraction();
       assertEquals(4, a2.calcSubtraction(8,4));
       assertEquals(10, a2.calcSubtraction(20,10));
       assertEquals(2, a2.calcSubtraction(4,2));
   }
}
