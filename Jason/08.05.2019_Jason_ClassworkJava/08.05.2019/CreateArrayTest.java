import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CreateArrayTest
{
    @Test
    public void testCreateArray()
    {
        CreateArray ca = new CreateArray();
        assertEquals(0, ca.getElement(0));
        ca.createArray(0, 10);
        assertEquals(10, ca.getElement(0));
        ca.createArray(1, 12);
        assertEquals(12, ca.getElement(1));
        ca.createArray(2, 14);
    }
}
