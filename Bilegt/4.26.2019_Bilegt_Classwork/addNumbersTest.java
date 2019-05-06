

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AddNumbersTest
{
    @Test
    public void AddNumbersTest()
    {
        AddNumbers a1 = new AddNumbers();
        assertEquals(12, a1.Addition(2,4,6));
        assertEquals(6, a1.Addition(1,2,3));
        assertEquals(10, a1.Addition(4,5,1));
    }
}
