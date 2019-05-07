

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkThreeTest
{
    @Test
    public void testClassworkThree()
    {
        ClassworkThree c4 = new ClassworkThree();
        assertEquals(12, c4.getI(11));
    }
}
