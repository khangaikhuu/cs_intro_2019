

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class check_Less100Test
{
    @Test
    public void asdf()
    {
        check_Less100 c1 = new check_Less100();
        assertEquals(true, c1.check(1, 8));
        assertEquals(false, c1.check(200, 200));
        assertEquals(true, c1.check(80, 20));
        
    }
}
