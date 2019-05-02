

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
        assertEquals(true, l1. isEqual(3,3));
        assertEquals(true, l1. isEqual(7,7));
        assertEquals(true, l1. lessThan(4,9));
        assertEquals(true, l1. lessThan(3,10));
        assertEquals(true, l1. lessThanorEqual(2,2));
        assertEquals(true, l1. lessThanorEqual(4,4));
        assertEquals(true, l1. greaterThan(7,3));
        assertEquals(true, l1. greaterThan(12,2));
        assertEquals(true, l1. notEquals(5,4));
        assertEquals(true, l1. notEquals(3,6));
        assertEquals(true, l1. greaterThanEquals(5,2));
        assertEquals(true, l1. greaterThanEquals(4,4));
    }
}
