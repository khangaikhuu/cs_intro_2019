

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SubtractNumbersTest
{
    @Test
    public void SubtractNumbers()
    {
        SubtractNumbers s1 = new SubtractNumbers();
        assertEquals (0, s1.SubtractNumbers(1, 1));
        assertEquals (1, s1.SubtractNumbers(2, 1));
        assertEquals (2, s1.SubtractNumbers(3, 1));
    }
}
