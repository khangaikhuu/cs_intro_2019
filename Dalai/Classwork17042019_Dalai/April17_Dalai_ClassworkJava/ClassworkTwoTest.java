

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkTwoTest
{
    @Test
    public void testMyMethod()
    {
        ClassworkTwo cc = new ClassworkTwo(11.12f, 11.12);
        assertEquals(11.12, cc.getA(),1);
        assertEquals(11.12f, cc.getB(),1);
    }
}
