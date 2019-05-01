

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LogicalOperationsTest
{
    @Test
    public void testmyMethod()
    {
        LogicalOperations l1 = new LogicalOperations();
        assertEquals(true, l1.isEqual(3, 3));
        assertEquals(false, l1.isEqual(1, 3));
        assertEquals(true, l1.isEqual(5, 5));
        assertEquals(true, l1.lessThan(3, 4));
        assertEquals(false, l1.lessThan(4, 3));
        assertEquals(false, l1.lessThan(5, 3));
        assertEquals(true, l1.lessThanOrEqual(3, 3));
        assertEquals(false, l1.lessThanOrEqual(6, 3));
        assertEquals(true, l1.lessThanOrEqual(1, 3));
        assertEquals(true, l1.greaterThan(5, 3));
        assertEquals(false, l1.greaterThan(3, 3));
        assertEquals(true, l1.greaterThan(9, 3));
        assertEquals(true, l1.notEquals(5, 3));
        assertEquals(false, l1.notEquals(9, 9));
        assertEquals(true, l1.notEquals(6, 3));
        assertEquals(true, l1.greaterthanequals(6, 3));
        assertEquals(false, l1.greaterthanequals(1, 3));
        assertEquals(true, l1.greaterthanequals(7, 1));
    }
}
