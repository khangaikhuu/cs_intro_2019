import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class addNumbersTest
{
    @Test
    public void TestaddNumbers()
    {
        addNumbers n1 = new addNumbers();
        assertEquals(6, n1.addNumbers(1,2,3));
    }
}