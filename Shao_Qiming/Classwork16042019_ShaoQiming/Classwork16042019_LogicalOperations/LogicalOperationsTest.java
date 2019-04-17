

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
        assertEquals(true, l1.isEqual(3, 3));
        assertEquals(false, l1.isEqual(2, 3));
        assertEquals(true, l1.lessThan(2, 3));
        assertEquals(false, l1.lessThan(6, 3));
        assertEquals(true, l1.lessThanOrEqual(3, 3));
        assertEquals(false, l1.lessThanOrEqual(6, 3));
        assertEquals(true, l1.greaterThan(5, 1));
        assertEquals(false, l1.greaterThan(5, 10));
        assertEquals(true, l1.notEquals(3, 5));
        assertEquals(false, l1.notEquals(5, 5));
        assertEquals(true, l1.greaterthanEquals(6, 4));
        assertEquals(false, l1.greaterthanEquals(3, 4));
    }
}
