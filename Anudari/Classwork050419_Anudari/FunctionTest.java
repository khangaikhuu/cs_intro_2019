

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FunctionTest
{
    @Test
    public void testMyFunction()
    {
        Function f1 = new Function();
        assertEquals(34,f1.getFunction(3,5));
        assertEquals(20,f1.getFunction(2,4));
        assertEquals(500,f1.getFunction(10,20));
    }
}
