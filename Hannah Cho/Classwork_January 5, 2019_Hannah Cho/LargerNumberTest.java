

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LargerNumberTest
{
    @Test
    public void TestMyMethod()
    {
        LargerNumber l1 = new LargerNumber();
        assertEquals(true, l1.larger(8,2));
        assertEquals(false, l1.larger(1,10));
        assertEquals(true, l1.larger(5,3));
    }
}
