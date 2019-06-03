import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementTest
{
    @Test
    public void testGiveMeMyElement()
    {
        GiveMeMyElement gmme = new GiveMeMyElement();
        assertEquals(1, gmme.GiveMyElement(0));
        assertEquals(4, gmme.GiveMyElement(3));
        assertEquals(25, gmme.GiveMyElement(5));
    }
}
