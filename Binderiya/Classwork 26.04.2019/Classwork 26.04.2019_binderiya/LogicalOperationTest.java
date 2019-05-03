

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
       assertEquals(true, l1.LogicalOperation(true,true,true));
       assertEquals(false, l1.LogicalOperation(false,false,false));
       assertEquals(true, l1.LogicalOperation(true,false,true));
   }
}
