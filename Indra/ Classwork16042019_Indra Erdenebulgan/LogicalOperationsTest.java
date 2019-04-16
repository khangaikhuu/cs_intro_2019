

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
       assertEquals(true, l1.isEqual(1,1));
       assertEquals(true, l1.lessThan(1,2));
       assertEquals(true, l1.lessThanOrEqual(1,1));
       assertEquals(true, l1.greaterThan(3,1));
       assertEquals(true, l1.notEquals(3,1));
       assertEquals(true, l1.greaterThanEquals(3,1));
       assertEquals(true, l1.isEqual(2,2));
       assertEquals(true, l1.lessThan(1,3));
       assertEquals(true, l1.lessThanOrEqual(2,3));
       assertEquals(true, l1.greaterThan(4,2));
       assertEquals(true, l1.notEquals(5,1));
       assertEquals(true, l1.greaterThanEquals(3,3));
   }
}
