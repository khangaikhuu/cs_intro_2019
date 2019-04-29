

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AddNumbersTest
{
    @Test
    public void TestMyMethod()
    {
        AddNumbers a1 = new AddNumbers();
        assertEquals(5, a1.getAddition(2,1,2));
        assertEquals(8, a1.getAddition(5,2,1));
        assertEquals(9, a1.getAddition(4,3,2));
    }
}
