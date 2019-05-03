

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sum100Test
{
    @Test 
    public void TestSum100()
    {
        Sum100 c4 = new Sum100();
        assertEquals(5050, c4.Sum());
    }
}
