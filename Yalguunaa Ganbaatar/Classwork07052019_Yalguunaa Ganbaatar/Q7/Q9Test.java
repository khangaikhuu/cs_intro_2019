

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q9Test
{
   @Test
   public void testQ9()
   {
       Q9 t = new Q9();
       assertEquals(false, t.calc(true,false));
       assertEquals(true, t.calc(false,false));
       assertEquals(true, t.calc(true,true));
    }
}
