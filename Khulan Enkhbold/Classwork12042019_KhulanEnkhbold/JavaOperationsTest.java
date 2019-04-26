

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JavaOperationsTest
{
    @Test 
    public void nameTest()
    {
        PrintMyName j = new PrintMyName();
        assertEquals("Khangai", j.getName());
        
    }
}
