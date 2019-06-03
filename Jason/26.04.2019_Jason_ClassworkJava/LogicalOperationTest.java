import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class LogicalOperationTest
{
    @Test
    public void TestLogicalOperation()
    {
        LogicalOperation l1 = new LogicalOperation();
        assertEquals(true, l1.getLogicalOperation(true,true,true));
        assertEquals(true, l1.getLogicalOperation(true,false,true));
        assertEquals(false, l1.getLogicalOperation(false,false,false));
    }
}
