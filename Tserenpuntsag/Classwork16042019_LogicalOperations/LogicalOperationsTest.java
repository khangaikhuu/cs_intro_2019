

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
        assertEquals(false,l1.isEqual(1,0));
        assertEquals(false,l1.lessThan(1,0));
        assertEquals(false,l1.lessThanOrEqual(5,5));
        assertEquals(true,l1.greaterThan(2,8));
        assertEquals(true,l1.notEquals(6,9));
        assertEquals(false,l1.greaterThanEquals(3,7));
        assertEquals(false,l1.isEqual(1,0));
        assertEquals(false,l1.lessThan(4,4));
        assertEquals(false,l1.lessThanOrEqual(8,0));
        assertEquals(true,l1.greaterThan(5,5));
        assertEquals(false,l1.notEquals(0,0));
        assertEquals(true,l1.greaterThanEquals(1,0));
    }
        
        
}
