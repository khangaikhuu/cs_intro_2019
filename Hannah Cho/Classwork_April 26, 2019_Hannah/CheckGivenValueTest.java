

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CheckGivenValueTest
{
    @Test
    public void TestMyMethod()
    {
        CheckGivenValue c1 = new CheckGivenValue();
        assertEquals(true, c1.getGivenValue(89));
        assertEquals(false, c1.getGivenValue(102));
        assertEquals(true, c1.getGivenValue(46));
    }
}
