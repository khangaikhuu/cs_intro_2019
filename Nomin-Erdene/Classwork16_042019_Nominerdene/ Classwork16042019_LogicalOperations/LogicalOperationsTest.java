

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
       assertEquals(true, l1.isEquals(1,1));
       assertEquals(true, l1.isEquals(2,2));
       assertEquals(true, l1.lessThan(3,4));
       assertEquals(true, l1.lessThan(8,9));
       assertEquals(true, l1.lessThanOrEqual(1,1));
       assertEquals(true, l1.lessThanOrEqual(2,2));
       assertEquals(true, l1.greaterThan(4,2));
       assertEquals(true, l1.greaterThan(5,3));
       assertEquals(true, l1.notEquals(4,5));
       assertEquals(true, l1.notEquals(2,3));
       assertEquals(true, l1.greaterThanEquals(3,1));
       assertEquals(true, l1.greaterThanEquals(5,2));
    }
}
