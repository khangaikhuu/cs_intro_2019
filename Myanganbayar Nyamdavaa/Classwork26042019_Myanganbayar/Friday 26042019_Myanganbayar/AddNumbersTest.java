

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AddNumbersTest
{
    @Test
    public void AddNumbers()
    {
        AddNumbers a1 = new AddNumbers();
        assertEquals (8, a1.AddNumbers(3, 2, 3));
        assertEquals (6, a1.AddNumbers(2, 3, 1));
        assertEquals (22, a1.AddNumbers(12, 5, 5));
    }
}
