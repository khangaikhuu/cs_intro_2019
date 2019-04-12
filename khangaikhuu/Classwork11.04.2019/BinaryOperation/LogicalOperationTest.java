import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogicalOperationTest
{
    
    @Test
    public void testOrOperation()
    {
        LogicalOperation lo = new LogicalOperation();
        assertEquals(true, lo.orOperation(true, false));
    }
   
}
