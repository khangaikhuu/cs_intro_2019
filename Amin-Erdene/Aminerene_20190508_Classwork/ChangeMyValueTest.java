

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
        cmv.ChangeValue(0,10);
        assertEquals(10, cmv.getElement(0));
        cmv.ChangeValue(2,5);
        assertEquals(5, cmv.getElement(2));
        cmv.ChangeValue(4,6);
        assertEquals(6, cmv.getElement(4));
    }
}
