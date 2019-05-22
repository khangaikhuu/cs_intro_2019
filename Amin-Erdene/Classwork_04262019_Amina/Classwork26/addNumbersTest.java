

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class addNumbersTest
{
    @Test
    public void AddNumbers()
    {
        AddNumbers a1 = new AddNumbers();
        assertEquals(6, a1.addNumbers(1,2,3));
        assertEquals(9, a1.addNumbers(2,3,4));
        assertEquals(12, a1.addNumbers(3,4,5));
    }
}
