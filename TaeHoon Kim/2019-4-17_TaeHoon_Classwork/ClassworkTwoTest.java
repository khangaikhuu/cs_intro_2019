

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkTwoTest
{
    @Test
    public void testForTwo()
    {
        ClassworkTwo c2 = new ClassworkTwo(2.0f, 4.0);
        assertEquals(2.0f, c2.getX(), 1);
        assertEquals(4.0, c2.getY(), 1);
        c2.setX(4.0f);
        c2.setY(5.0f);
        assertEquals(4.0f, c2.getX(), 1);
        assertEquals(5.0, c2.getY(), 1);
    }
}
