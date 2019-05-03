

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AddNumbersTest
{
    @Test
   public void testAddNumbers ()
   {
       AddNumbers an = new AddNumbers();
       assertEquals(11, an.getAddNumbers(5, 3 ,3), 1);
       assertEquals(20, an.getAddNumbers(10, 6 ,4), 1);
       assertEquals(18, an.getAddNumbers(3, 7, 8), 1);
    }
}
