

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class check_equalTest
{
    @Test
    public void testThisMethod()
    {
        check_equal c1 = new check_equal();
        assertEquals(true, c1.check(1, 1));
        assertEquals(false, c1.check(2, 1));
        assertEquals(true, c1.check(4, 4));
    }
}
