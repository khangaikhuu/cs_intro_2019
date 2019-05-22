

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ChangeMyValueTest
{
    @Test
    public void TestChangeMyValue()
    {
        ChangeMyValue c1 = new ChangeMyValue();
        assertEquals(2, c1.getElement(1));
        c1.ChangeMyValue(25, 1);
        assertEquals(25, c1.getElement(1));
        c1.ChangeMyValue(23, 2);
        assertEquals(23, c1.getElement(2));
        c1.ChangeMyValue(45, 3);
        assertEquals(45, c1.getElement(3));
    }
}
