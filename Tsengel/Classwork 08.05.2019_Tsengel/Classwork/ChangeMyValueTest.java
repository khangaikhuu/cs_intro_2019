import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChangeMyValueTest
{
    @Test
    public void testValue()
    {
        ChangeMyValue ca = new ChangeMyValue();
        ca.changeValue(10, 2);
        assertEquals(10, ca.getElement(2));
        ca.changeValue(20, 5);
        assertEquals(20, ca.getElement(5));
        ca.changeValue(11, 3);
        assertEquals(11, ca.getElement(3));
    }
}
