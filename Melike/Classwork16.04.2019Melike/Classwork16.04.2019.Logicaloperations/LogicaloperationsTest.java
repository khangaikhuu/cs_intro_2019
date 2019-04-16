

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LogicaloperationsTest
{
  @Test
  public void testMyMethod()
  {
      Logicaloperations melike = new Logicaloperations();
      assertEquals(true, melike.isEqual(1,1));
      assertEquals(false, melike.isEqual(1,2));
      
      assertEquals(true, melike.lessThan(2,13));
      assertEquals(false, melike.lessThan(2,2));
      
      assertEquals(true, melike.lessThanOrEqual(2,2));
      assertEquals(false, melike.lessThanOrEqual(3,2));
      
      assertEquals(true, melike.greaterThan(13,2));
      assertEquals(false, melike.greaterThan(2,13));
      
      assertEquals(true, melike.notEquals(3,2));
      assertEquals(false, melike.notEquals(2,2));
      
      assertEquals(true, melike.greaterThanEquals(3,2));
      assertEquals(false, melike.greaterThanEquals(2,3));
      
  }
}
