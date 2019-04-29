

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class addNumbersTest
{
    @Test
    public void testaddNumbers()
    {
        addNumbers a2 = new addNumbers();
        assertEquals(12, a2.addNumbers(2,4,6));
        assertEquals(8, a2.addNumbers(1,2,5));
        assertEquals(10, a2.addNumbers(4,5,1));
    }
}
