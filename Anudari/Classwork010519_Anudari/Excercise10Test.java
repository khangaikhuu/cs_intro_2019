

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Excercise10Test
{
    @Test
    public void testMyMethod()
    {
        Excercise10 e1 = new Excercise10();
        assertEquals(true,e1.getNumber(4,5));
        assertEquals(true,e1.getNumber(8,12));
        assertEquals(true,e1.getNumber(14,34));
        assertEquals(false,e1.getNumber(400,500));
        assertEquals(false,e1.getNumber(490,580));
        assertEquals(false,e1.getNumber(900,580));
    }
}
