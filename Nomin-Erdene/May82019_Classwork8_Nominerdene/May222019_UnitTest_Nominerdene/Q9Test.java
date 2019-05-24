

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q9Test
{
    @Test 
    public void Q9Test()
    {
        Q9 q1 = new Q9();
        assertEquals(false, q1.Q9(true,false));
        assertEquals(true, q1.Q9(true,true));
        assertEquals(false, q1.Q9(false,true));
    }
}
