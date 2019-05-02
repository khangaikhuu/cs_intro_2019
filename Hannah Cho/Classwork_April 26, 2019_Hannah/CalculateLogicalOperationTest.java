

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculateLogicalOperationTest
{
    @Test
    public void TestMyMethod()
    {
       CalculateLogicalOperation c1 = new CalculateLogicalOperation();
        assertEquals(true, c1.getLogicalOperation(true,true,true));
        assertEquals(false, c1.getLogicalOperation(false,true,false));
        assertEquals(false, c1.getLogicalOperation(false,false,false));
    }
}
