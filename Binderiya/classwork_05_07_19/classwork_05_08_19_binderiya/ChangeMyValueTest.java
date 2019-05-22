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
        cmv.changeValue(10, 2);
        assertEquals(10, cmv.getElement(2));
        cmv.changeValue(11, 3);
        assertEquals(11, cmv.getElement(3));
        cmv.changeValue(20, 5);
        assertEquals(20, cmv.getElement(5));
    }
}
