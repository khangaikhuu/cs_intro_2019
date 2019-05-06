import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LargeNumTest
{
    @Test
    public void testLarge()
    {
        LargeNum l1 = new LargeNum();
        assertEquals(5, l1. Large(5,1));
        assertEquals(9, l1. Large(9,3));
        assertEquals(10, l1. Large(1,10));
    }
}
