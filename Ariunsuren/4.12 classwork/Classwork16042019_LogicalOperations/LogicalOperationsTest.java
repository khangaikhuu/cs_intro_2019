

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LogicalOperationsTest
{
  @Test
  public void testMyMethod()
  {
      LogicalOperations c1 = new LogicalOperations();
      assertEquals(true,c1.isEqual(1,1));
      assertEquals(true,c1.lessThan(1,2));
      assertEquals(true,c1.lessThanOrEqual(1,2));
      assertEquals(true,c1.greaterThan(3,2));
      assertEquals(true,c1.notEquals(1,2));
      assertEquals(true,c1.greaterThanEquals(2,2));
      assertEquals(false,c1.isEqual(2,3));
      assertEquals(true,c1.lessThan(2,3));
      assertEquals(false,c1.lessThanOrEqual(4,3));
      assertEquals(true,c1.greaterThan(4,3));
      assertEquals(true,c1.notEquals(2,3));
      assertEquals(true,c1.greaterThanEquals(4,3));
    }
}
