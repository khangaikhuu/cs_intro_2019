
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class addNumbersTest
{
    @Test
    public void testaddNumbers()
    {
        addNumbers a2 = new addNumbers();
        assertEquals(12, a2.addNumbers(2,4,6));
        assertEquals(22, a2.addNumbers(8,9,5));
        assertEquals(11, a2.addNumbers(3,6,2));
    }
}
