

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkThreeTest
{
    @Test
    public void ClassworkThree()
    {
        ClassworkThree c1 = new ClassworkThree();
        assertEquals(20, c1.getI(20));
        ClassworkThree c2 = new ClassworkThree();
        assertEquals(40, c2.loopI(40));
        ClassworkThree c3 = new ClassworkThree();
        assertEquals(30, c3.loopI(30));

    }
}
