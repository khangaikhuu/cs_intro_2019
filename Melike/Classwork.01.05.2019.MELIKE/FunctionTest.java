

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FunctionTest
{
    @Test
   public void testFunction ()
   {
       Function f = new Function();
       assertEquals(61, f.getFunction(5, 6), 1);
       assertEquals(25, f.getFunction(3, 4), 1);
       assertEquals(8, f.getFunction(2, 2), 1);
    }
}
