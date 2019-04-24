import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SharkTest
{
    @Test
    public void testMyMethod()
    {
        Shark c1 = new Shark();
        assertEquals(false, c1.getIsTrue());
        assertEquals(100, c1.getMyInteger());
    }
}
