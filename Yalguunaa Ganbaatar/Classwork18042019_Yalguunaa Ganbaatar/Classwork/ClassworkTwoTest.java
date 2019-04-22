

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkTwoTest
{
    @Test
    public void testClassworkTwo()
    {
        ClassworkTwo t1 =  new ClassworkTwo(1,2);
        assertEquals(4, t1.getFreedom(2));
        assertEquals(3, t1.getAbs(3));
        assertEquals(256, t1.getGirlz(4));
        assertEquals(3125, t1.getGirlz(5));
        assertEquals(46656, t1.getGirlz(6));
    }
    
}
