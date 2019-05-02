

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LawGravityTest
{
    @Test
    public void testThisMethod()
    {
        LawGravity c1 = new LawGravity();
        assertEquals(122.451799, c1.CalcGravity(23, 3, 5), 1);
        assertEquals(10064.6109, c1.CalcGravity(65, 21, 3), 1);
        assertEquals(20674.029, c1.CalcGravity(32, 54, 2), 1);
    }
}
