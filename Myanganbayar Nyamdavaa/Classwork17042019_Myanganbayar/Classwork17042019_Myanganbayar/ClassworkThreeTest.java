

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ClassworkThreeTest
{
    @Test
    public void testMyMethod()
    {
        ClassworkThree ct = new ClassworkThree();
        assertEquals(1, ct.getX(), 1);
    }
}
