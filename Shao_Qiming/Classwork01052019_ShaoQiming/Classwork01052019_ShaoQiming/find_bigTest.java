

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class find_bigTest
{
    @Test
    public void asdf()
    {
        find_big c1 = new find_big();
        assertEquals(3, c1.compare(3, 1));
        assertEquals(2, c1.compare(2, 1));
        assertEquals(19, c1.compare(19, 1));
        
    }

}
