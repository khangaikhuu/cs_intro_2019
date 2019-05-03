

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class function1Test
{
    @Test
    public void testThisMethod()
    {
        function1 c1 = new function1();
        assertEquals(2, c1.f(1, 1), 0.1);
        assertEquals(8, c1.f(2, 2), 0.1);
        assertEquals(13, c1.f(2, 3), 0.1);
    }
}
