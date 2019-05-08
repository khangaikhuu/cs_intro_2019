import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMyElementTest
{
    @Test
    public void testMyArray()
    {
        GiveMyElement m = new GiveMyElement();
        assertEquals(3, m.GetElement(2));
        assertEquals(4, m.GetElement(3));
        assertEquals(19, m.GetElement(4));
    }
}
