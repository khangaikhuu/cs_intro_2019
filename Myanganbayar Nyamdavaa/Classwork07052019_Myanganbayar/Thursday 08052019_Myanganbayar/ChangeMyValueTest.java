

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ChangeMyValueTest
{
    @Test
    public void TestMethod()
    {
        ChangeMyValue cmv = new ChangeMyValue();
        assertEquals(1, cmv.getElement(0));
        cmv.ChangeMyValue(0, 10);
        assertEquals(10, cmv.getElement(0));
        cmv.ChangeMyValue(1, 10);
        assertEquals(10, cmv.getElement(0));
        cmv.ChangeMyValue(0, 10);
        assertEquals(10, cmv.getElement(0));
    }
}
