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
        assertEquals(19, a2.addNumber(5,6,8));
        assertEquals(15, a2.addNumber(5,5,5));
        assertEquals(22, a2.addNumber(7,6,9));
    }
}
