

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
        assertEquals(1, cmv.getElement(0));
        assertEquals(4, cmv.getElement(3));
        assertEquals(23, cmv.getElement(6));
    }
}
