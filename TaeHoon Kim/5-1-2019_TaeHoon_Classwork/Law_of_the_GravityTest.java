

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Law_of_the_GravityTest
{
     @Test
    public void testLaw_of_the_GravityTest()
    {
        Law_of_the_Gravity g = new Law_of_the_Gravity();
        assertEquals(35.0, g.getGravity(4,5,2,7), 1);
        assertEquals(1.7, g.getGravity(2,2,3,4), 1);
    }
}
