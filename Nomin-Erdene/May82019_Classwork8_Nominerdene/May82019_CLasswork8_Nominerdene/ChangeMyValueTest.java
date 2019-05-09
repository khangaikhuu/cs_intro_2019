

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
        cmv.ChangeValue(0,10);
        assertEquals(10,cmv.getElement(0));
        cmv.ChangeValue(1,8);
        assertEquals(8,cmv.getElement(1));
        cmv.ChangeValue(9,3);
        assertEquals(3,cmv.getElement(9));
    }
}
