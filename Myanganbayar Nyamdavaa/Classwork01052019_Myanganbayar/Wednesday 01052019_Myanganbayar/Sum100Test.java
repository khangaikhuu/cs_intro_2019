

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Sum100Test
{
    @Test
    public void testMyMethod()
    {
        Sum100 c1 = new Sum100();
        assertEquals(5050, c1.calcSum());
    }
}