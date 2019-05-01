

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AdditionTest
{
    @Test
    public void AdditionTest()
    {
        Addition a1 = new Addition();
        assertEquals(12, a1.Addition(2,4,6));
        assertEquals(6, a1.Addition(1,2,3));
        assertEquals(10, a1.Addition(4,5,1));
    }
}
