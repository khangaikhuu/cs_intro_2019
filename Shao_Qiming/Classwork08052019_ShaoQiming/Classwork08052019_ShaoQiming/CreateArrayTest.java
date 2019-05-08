

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CreateArrayTest
{
    @Test
    public void testThisMethod()
    {
        CreateArray c1 = new CreateArray();
        assertEquals(2, c1.setNum(0, 2));
        assertEquals(4, c1.setNum(1, 4));
        assertEquals(6, c1.setNum(2, 6));
    }
    
}
