
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
        assertEquals(true, l1.isEqual(8,8));
        assertEquals(false, l1.isEqual(6,8));
        assertEquals(true, l1.lessThan(2,8));
        assertEquals(false, l1.lessThan(9,8));
        assertEquals(true, l1.lessThanOrEqual(2,2));
        assertEquals(false, l1.lessThanOrEqual(8,3));
        assertEquals(true, l1.greaterThan(10,2));
        assertEquals(false, l1.greaterThan(1,3));
        assertEquals(true, l1.notEquals(10,2));
        assertEquals(false, l1.notEquals(3,3));
        assertEquals(true, l1.greaterThanEquals(10,10));
        assertEquals(false, l1.greaterThanEquals(3,6));                 
    }
}
