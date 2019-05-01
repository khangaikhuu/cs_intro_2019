

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveNumberLessThanHundredTest
{
    @Test
    public void testLessThanHundred()
    {
        GiveNumberLessThanHundred a2 = new GiveNumberLessThanHundred();
        assertEquals(true, a2.LessThanHundred(49));
        assertEquals(false, a2.LessThanHundred(515));
        assertEquals(false, a2.LessThanHundred(100));
    }
}
