

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class addNumbersTest
{
    @Test
    public void testaddNumbers()
    {
        addNumbers an = new addNumbers();
        assertEquals(12, an.addNumbers(2,4,6));
        assertEquals(22, an.addNumbers(8,9,5));
        assertEquals(11, an.addNumbers(3,6,2));
    }
}
