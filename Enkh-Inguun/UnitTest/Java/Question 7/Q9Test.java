

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q9Test
{
    @Test
   public void testLogicalOperation()
   {
       Q9 l1 = new Q9();
       assertEquals(true, l1.LogicalOperation(true,true));
       assertEquals(true, l1.LogicalOperation(false,false));
       assertEquals(false, l1.LogicalOperation(true,false));
   }
  
}

  
