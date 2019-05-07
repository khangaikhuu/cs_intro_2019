import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GiveMeMyElementWithIndexTest
{
    @Test
    public void testMyElementSize()
    {
        GiveMeMyElementWithIndex ma = new GiveMeMyElementWithIndex();
        int [] array = {1, 2, 3, 4};
        assertEquals(4, ma.getIndex(3, array));
        assertEquals(3, ma.getIndex(2, array));
        assertEquals(2, ma.getIndex(1, array));
    }
}
