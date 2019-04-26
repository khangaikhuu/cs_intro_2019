

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SubtractNumberstest
{
    @Test
    public void testSubtractNumbers() 
    { 
        SubtractNumbers c4 = new SubtractNumbers(); 
        assertEquals(10, c4.SubtractNumbers(12, 2)); 
        assertEquals(6, c4.SubtractNumbers(9, 3)); 
        assertEquals(26, c4.SubtractNumbers(31, 5)); 
    } 
}
