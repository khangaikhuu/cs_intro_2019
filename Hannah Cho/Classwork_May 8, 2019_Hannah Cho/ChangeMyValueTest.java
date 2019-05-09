

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ChangeMyValueTest
{
    @Test
    public void TestMyMethod()
    {
        ChangeMyValue cmv = new ChangeMyValue();
        cmv.changeValue(0,10);
        assertEquals(10, cmv.getElement(0));
        cmv.changeValue(1,8);
        assertEquals(8, cmv.getElement(1));
        cmv.changeValue(3,9);
        assertEquals(9, cmv.getElement(3));
    }
}
