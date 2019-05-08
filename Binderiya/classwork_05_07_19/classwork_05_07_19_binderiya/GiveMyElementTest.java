import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMyElementTest
{
    @Test
    public void testMyArray()
    {
        MyArray m = new MyArray(1);
        assertEquals(2, m.getmyArray(2));
        assertEquals(3, m.getGiveMyElement(3));
        assertEquals(4, m.getMeMyElement(4));
    }
}
