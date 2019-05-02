

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LogicalOperationTest
{
       @Test
   public void testLogicalOperations ()
   {
       LogicalOperation lo = new LogicalOperation();
       assertEquals(true, lo.getLogicalOperation(true, false, true));
       assertEquals(true, lo.getLogicalOperation(true, true, false));
       assertEquals(false, lo.getLogicalOperation(false, true, false));
    }
}
