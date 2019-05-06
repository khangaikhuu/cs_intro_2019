

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LawOfGravityTest
{
    @Test
    public void testGravity()
    {
        LawOfGravity g = new LawOfGravity();
        assertEquals(35.0, g.getGravity(4,5,2,7), 1);
        assertEquals(1.7, g.getGravity(2,2,3,4), 1);
        assertEquals(1.92, g.getGravity(2,3,5,8), 1);
    }
}
