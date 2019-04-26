

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LogicalOperationsTest
{
   @Test
   public void testMyMethod()
   {
     LogicalOperations l1 = new LogicalOperations();
     assertEquals (true, l1.isEqual (1,1));
     assertEquals (true, l1.isEqual (2,2));
     assertEquals (true, l1.notEquals (3,2));
     assertEquals (true, l1.notEquals (1,4)); 
     assertEquals (true, l1.lessThan (1,4));
     assertEquals (true, l1.lessThan (1,6));
     assertEquals (true, l1.lessThanOrEqual (1,5));
     assertEquals (true, l1.lessThanOrEqual (1,1));
     assertEquals (true, l1.greaterThan (5,1));
     assertEquals (true, l1.greaterThan (9,1));
     assertEquals (true, l1.greaterThanOrEqual (5,1));
     assertEquals (true, l1.greaterThanOrEqual(1,1));
    }
}
  