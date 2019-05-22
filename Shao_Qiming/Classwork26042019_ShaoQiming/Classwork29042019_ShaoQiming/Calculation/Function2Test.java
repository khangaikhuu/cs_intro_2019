

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Function2Test
{
    @Test
    public void testThisMethod()
    {
        Function2 c1 = new Function2();
        assertEquals(true, c1.f(false, false));
        assertEquals(false, c1.f(false, true));
        assertEquals(false, c1.f(true, true));
    }
}
