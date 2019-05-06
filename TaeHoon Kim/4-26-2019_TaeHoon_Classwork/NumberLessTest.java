import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class NumberLessTest
{
    @Test
    public void testCheck100()
    {
        NumberLess nl = new NumberLess();
        assertEquals(true, nl.Less100(49));
        assertEquals(false, nl.Less100(120));
        assertEquals(true, nl.Less100(99));
    }
}