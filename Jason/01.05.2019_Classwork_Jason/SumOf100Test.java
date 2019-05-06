import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class SumOf100Test
{
    @Test
    public void testSum()
    {
        SumOf100 s1 = new SumOf100();
        assertEquals(5050, s1.first100());
    }
}
