

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class NumberAdditionTest
{ 
    @Test
    public void AddNumbers()
    {
        NumberAddition a1 = new NumberAddition();
        assertEquals(8, a1.addNumbers(3,2,3));
        assertEquals(6, a1.addNumbers(2,3,1));
        assertEquals(22, a1.addNumbers(12,5,5));
    }
}