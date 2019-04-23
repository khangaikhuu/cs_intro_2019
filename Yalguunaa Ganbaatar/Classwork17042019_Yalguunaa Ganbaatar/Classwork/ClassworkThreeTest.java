

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClassworkThreeTest
{
    @Test
    public void testClassworkThree()
    {
        ClassworkThree t1 = new ClassworkThree();
        assertEquals(10, t1.getAri(10));
        assertEquals(11, t1.getCharlie(2));
    }
}
