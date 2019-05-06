

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculateFxTest
{
    @Test
    public void Fx()
    {
        CalculateFx f1 = new CalculateFx();
        assertEquals(29, f1.Fx(2, 5), 1);
        assertEquals(10, f1.Fx(1, 3), 1);
        assertEquals(89, f1.Fx(5, 8), 1);
    }
}
