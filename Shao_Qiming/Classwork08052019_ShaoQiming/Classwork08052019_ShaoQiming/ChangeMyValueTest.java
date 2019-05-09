

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChangeMyValueTest
{
    @Test
    public void testMyMethod()
    {
        ChangeMyValue c1 = new ChangeMyValue();
        assertEquals(10, c1.ChangeMyValue(1, 10));
    }
}
