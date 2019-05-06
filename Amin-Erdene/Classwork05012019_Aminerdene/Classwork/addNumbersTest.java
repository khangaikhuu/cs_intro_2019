

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class addNumbersTest
{
   @Test
   public void testaddNumbers()
   {
       addNumbers c4 = new addNumbers();
       assertEquals(10, c4.addNumbers(2, 3, 5));
       assertEquals(14, c4.addNumbers(3, 2, 9));
       assertEquals(30, c4.addNumbers(5, 15, 10));
    }
}
