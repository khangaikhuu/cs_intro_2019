

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EqualNumberTest
{
    @Test
    public void TestMyMethod()
    {
        EqualNumber e1 = new EqualNumber();
        assertEquals(true, e1.equal(2,2));
        assertEquals(false, e1.equal(6,8));
        assertEquals(true, e1.equal(3,3));
    }
}
