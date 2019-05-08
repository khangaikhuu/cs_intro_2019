

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMySizeTest
{
    @Test
    public void testMyarray()
    {
      GiveMeMySize c1 = new GiveMeMySize();
      assertEquals(11, c1.getSizeOfMyArray());
      
    }
    
}
