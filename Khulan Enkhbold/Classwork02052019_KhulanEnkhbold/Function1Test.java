

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Function1Test
{
    @Test 
    public void testThisMethod()
    {
        Function1 c1 = new Function1();
        assertEquals(1, c1.f(1, 1), 0.1); 
        assertEquals(16, c1.f(2, 2), 0.1);
        assertEquals(36, c1.f(2, 3), 0.1);
    }
}
