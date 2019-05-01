
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumberLessTest
{
   @Test
    public void testCheck100()
    {
        NumberLess a2 = new NumberLess();
        assertEquals(true, a2.Less100(49));
        assertEquals(false, a2.Less100(515));
        assertEquals(false, a2.Less100(100));
    }
}
