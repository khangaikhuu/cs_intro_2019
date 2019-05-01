

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerameterofCircleTest
{
    @Test
    public void testPerameter()
    {
        PerameterofCircle p1 = new PerameterofCircle();
        assertEquals(43.96, p1.getPerameter(7), 1);
        assertEquals(25.12, p1.getPerameter(4), 1);
        assertEquals(31.40, p1.getPerameter(5), 1);
    }
}
