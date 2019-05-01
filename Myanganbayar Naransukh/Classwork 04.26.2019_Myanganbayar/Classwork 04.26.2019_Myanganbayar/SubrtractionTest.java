

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SubrtractionTest
{
    @Test 
    public void testThisMethod()
    {
        Subrtraction obj1 = new Subrtraction();
        assertEquals(1, obj1.subtraction(3, 2));
        assertEquals(2, obj1.subtraction(4, 2));
        assertEquals(3, obj1.subtraction(4, 1));
    }
}
