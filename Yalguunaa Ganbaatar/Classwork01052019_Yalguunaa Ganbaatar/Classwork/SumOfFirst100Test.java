

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumOfFirst100Test
{
    @Test
    public void testSumOfFirst100()
    {
        SumOfFirst100 s1 = new SumOfFirst100();
        assertEquals(5050, s1.sum());
    }
}
