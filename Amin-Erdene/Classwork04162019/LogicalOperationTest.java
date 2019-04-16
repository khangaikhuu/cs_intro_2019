

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogicalOperationTest
{
    @Test
    public void testMyMethod()
    {
        LogicalOperation l1 = new LogicalOperation();
        assertEquals(true, l1.isEqual(1,1));
        assertEquals(true, l1.isEqual(3,3));
        assertEquals(true, l1.lessThan(1,2));
        assertEquals(true, l1.lessThan(3,5));
        assertEquals(true, l1.lessThanOrEqual(1,1));
        assertEquals(true, l1.lessThanOrEqual(10,10));
        assertEquals(true, l1.greaterThan(3,1));
        assertEquals(true, l1.greaterThan(9,6));
        assertEquals(true, l1.notEquals(3,1));
        assertEquals(true, l1.notEquals(9,6));
        assertEquals(true, l1.greaterThanEquals(3,1));
        assertEquals(true, l1.greaterThanEquals(9,6));
    }
}
