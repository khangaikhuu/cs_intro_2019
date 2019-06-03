

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TwoNumbersAreEquaTest
{
   
    @Test
    public void testEqual()
    {
        TwoNumbersAreEqua c1 = new TwoNumbersAreEqua();
        assertEquals(true,c1.Equal(1,1));
        assertEquals(true,c1.Equal(2,2));
        assertEquals(true,c1.Equal(3,3));
    }
}
