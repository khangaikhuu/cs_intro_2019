

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SmallerNumberTest
{
    @Test
    public void TestMyMethod()
    {
        SmallerNumber s1 = new SmallerNumber();
        assertEquals(true, s1.smaller(25,54));
        assertEquals(false, s1.smaller(108,37));
        assertEquals(true, s1.smaller(67,12));
    }
}
