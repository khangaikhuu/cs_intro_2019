import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogicalOperationTest
{
   @Test
   public void testLogicalOperation()
   {
       LogicalOperation l1 = new LogicalOperation();
       assertEquals(true, l1.logicalOperation(true,true,true));
       assertEquals(true, l1.logicalOperation(true,false,true));
       assertEquals(false, l1.logicalOperation(false,false,false));
    }
}
