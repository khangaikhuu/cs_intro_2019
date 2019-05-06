

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EqualNumberTest
{
    @Test
    public void testEqual()
    {
        EqualNumber en = new EqualNumber();
        assertEquals(true, en.equal(1,1));
        assertEquals(true, en.equal(3,3));
        assertEquals(false, en.equal(3,4));
    }
}
