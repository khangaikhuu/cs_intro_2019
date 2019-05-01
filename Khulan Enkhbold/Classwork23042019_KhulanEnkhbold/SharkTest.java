

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SharkTest
{
    @Test
    public void testShark()
    {
        Shark cl = new Shark();
        assertEquals (false, cl.getIsTrue());
        assertEquals (102, cl.getMyInteger());
    }
        
}
