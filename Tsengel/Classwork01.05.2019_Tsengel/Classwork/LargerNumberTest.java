
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LargerNumberTest
{
  @Test
   public void testLarger()
   {
       LargerNumber l1 = new LargerNumber();
       assertEquals(5, l1.Larger(5,1));
       assertEquals(9, l1.Larger(9,3));
       assertEquals(10, l1.Larger(1,10));
    }
}
