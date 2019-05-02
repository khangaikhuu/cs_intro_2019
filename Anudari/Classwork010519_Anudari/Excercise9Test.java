

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Excercise9Test
{
    @Test
    public void testMyMethod() 
    {
        Excercise9 e1 = new Excercise9();
        assertEquals(true,e1.getNumber(4,4));
        assertEquals(true,e1.getNumber(9,9));
        assertEquals(true,e1.getNumber(8,8));
        assertEquals(false,e1.getNumber(1,3));
        assertEquals(false,e1.getNumber(1,9));
        assertEquals(false,e1.getNumber(7,3));
        
    }
}
