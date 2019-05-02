

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LawofGravityTest
{
    @Test
    public void TestMyMethod()
    {
        LawofGravity l1 = new LawofGravity();
        assertEquals(1.7, l1.getGravity(2,2,3,4), 1);
        assertEquals(35.0, l1.getGravity(4,5,2,7), 1);
        assertEquals(1.92, l1.getGravity(2,3,5,8), 1);
    }
}
