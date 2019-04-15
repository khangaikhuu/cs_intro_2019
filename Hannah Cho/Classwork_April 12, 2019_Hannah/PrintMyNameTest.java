

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PrintMyNameTest
{
    @Test
    public void nameTest()
    {
        JavaOperations j = new JavaOperations();
        assertEquals("hannah", j.getName());
        
    }
    
}
