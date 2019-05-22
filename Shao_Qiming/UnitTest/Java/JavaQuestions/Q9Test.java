

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Q9Test
{
    @Test
    public void TestMyMethod()
    {
        Q9 c1 = new Q9();
        assertEquals(true, c1.calc(true,true));
        assertEquals(true, c1.calc(false,false));
        assertEquals(false, c1.calc(true,false));
    }
}
