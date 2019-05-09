

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LessThan100Test
{
    @Test
    public void TestLessThan100()
    {
        LessThan100 c1 = new LessThan100();
        assertEquals (true, c1.LessThan100(34));
        assertEquals (false, c1.LessThan100(178));
        assertEquals (true, c1.LessThan100(79));
    }
}
