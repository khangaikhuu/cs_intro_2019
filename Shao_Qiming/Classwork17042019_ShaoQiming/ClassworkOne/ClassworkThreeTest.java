

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkThreeTest
{
    @Test
    public void ClassworkThreeTest()
    {
        ClassworkThree c1 = new ClassworkThree();
        assertEquals(1, c1.getI(1));
        assertEquals(10, c1.loopI(10));
    }
}
