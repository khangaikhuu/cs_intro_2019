

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CreateArrayTest
{
    @Test
    public void testCreateArray()
    {
        CreateArray t = new CreateArray();
        t.create(0, 4);
        assertEquals(4, t.getElement(0));
        t.create(4, 7);
        assertEquals(7, t.getElement(4));
        t.create(5, 3);
        assertEquals(3, t.getElement(5));
    }
}
