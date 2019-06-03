

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ChangeMyValueTest
{
   @Test
   public void testChangeMyValue()
   {
       ChangeMyValue cmv = new ChangeMyValue();
       cmv.setElement(10, 3);
       assertEquals(10, cmv.getElement(3));
       cmv.setElement(3, 5);
       assertEquals(3, cmv.getElement(5));
       cmv.setElement(4, 2);
       assertEquals(45, cmv.getElement(7));
    }
}
