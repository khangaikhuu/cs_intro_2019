

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
    assertEquals(true, l1.isEqual(7,7));
    assertEquals(true, l1.lessThan(4,5));
    assertEquals(true, l1.lessThan(8,9));
    assertEquals(true, l1.lessThanOrEqual(2,2));
    assertEquals(true, l1.lessThanOrEqual(1,2));
    assertEquals(true, l1.greaterThan(6,3));
    assertEquals(true, l1.greaterThan(8,5));
    assertEquals(true, l1.notEquals(5,4));
    assertEquals(true, l1.notEquals(3,6));
    assertEquals(true, l1.greaterThanEquals(4,1));
    assertEquals(true, l1.greaterThanEquals(9,2));
}

    
    
    
}
