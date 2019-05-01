

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
        assertEquals(1, c1.f(2, 3), 0.1);
        assertEquals(0, c1.f(1, 1), 0.1);
        assertEquals(3.8025, c1.f(9.6, 7.65), 0.0001);
    }
}
