

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ChangeMyValueTest
{
   @Test
   public void TestChangeMyValue()
   {
       ChangeMyValue c4 = new ChangeMyValue();
       assertEquals(2, c4.getElement(1));
       assertEquals(3, c4.getElement(2));
       assertEquals(45, c4.getElement(7));
    }
}
