

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
       assertEquals(true, l1.isEqual(3,3));
       assertEquals(false, l1.isEqual(3,4));
       assertEquals(true, l1.lessThan(1,10));
       assertEquals(false, l1.lessThan(5,1));
       assertEquals(true, l1.lessThanOrEqual(1,1));
       assertEquals(true, l1.lessThanOrEqual(4,6));
       assertEquals(true, l1.greaterThan(7,6));
       assertEquals(false, l1.greaterThan(5,7));
       assertEquals(true, l1.notEquals(6,3));
       assertEquals(false, l1.notEquals(4,4));
       assertEquals(true, l1.greaterThanEquals(7,7));
       assertEquals(true, l1.greaterThanEquals(7,5));
    }
}
