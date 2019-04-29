

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LogicalOperationTest
{
   @Test
   public void testMyMethod()
   {
       LogicalOperation l1 = new LogicalOperation();
       assertEquals(true, l1.getOperation(true, true, true));
       assertEquals(false, l1.getOperation(false,true,false));
       assertEquals(false, l1.getOperation(false,false,false));
    }
       
}
