

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ChangeMyValueTest
{
    @Test
    public void testChangeMyValue()
    {
       ChangeMyValue ma = new ChangeMyValue();
       ma.ChangeMyValue(0,10);
       assertEquals(2, ma.getElement(1));
       assertEquals(1, ma.getElement(0));
    }
}
