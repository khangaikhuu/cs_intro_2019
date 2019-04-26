

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calcSubtractionTest
{
    @Test
    public void testcalcSubtraction()
    {
        calcSubtraction a2 = new calcSubtraction();
        assertEquals(0, a2.calcSubtraction(4,4));
        assertEquals(4, a2.calcSubtraction(5,1));
        assertEquals(3, a2.calcSubtraction(6,3));
    }
}
