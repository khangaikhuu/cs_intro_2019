

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SharkTest
{
    @Test
    public void testShark()
    {
        Shark s1 = new Shark ();
        assertEquals(102,s1.getA());
        assertEquals(false, s1.getB());
    }
}
