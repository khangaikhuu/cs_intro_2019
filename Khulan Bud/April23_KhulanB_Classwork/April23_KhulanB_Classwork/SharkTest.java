

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SharkTest
{
    @Test
    public void testSharkTest()
    {
        Shark s = new Shark ();
        assertEquals (false, s.getShark());
        assertEquals (102, s.getInteger());
    }
}
