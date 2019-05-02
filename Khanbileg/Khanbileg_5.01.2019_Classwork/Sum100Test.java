

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Sum100Test
{
    @Test
    public void sum100Test()
    {
        Sum100 s1 = new Sum100();
        assertEquals(5050, s1.sum100());
        
    }
}
