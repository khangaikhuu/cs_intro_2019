

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class sum100Test
{
    @Test
    public void testThisMethod()
    {
        sum100 c1 = new sum100();
        assertEquals(5050, c1.calcSum());
    }
}
