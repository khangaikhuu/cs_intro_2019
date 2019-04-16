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
        assertEquals(true, l1.isEqual(4,4));
        assertEquals(false, l1.isEqual(6,3));
        assertEquals(true, l1.lessThan(2,4));
        assertEquals(false, l1.lessThan(7,4));
        assertEquals(true, l1.lessThanOrEqual(2,2));
        assertEquals(false, l1.lessThanOrEqual(7,3));
        assertEquals(true, l1.greaterThan(5,1));
        assertEquals(false, l1.greaterThan(4,8));
        assertEquals(true, l1.notEquals(4,7));
        assertEquals(false, l1.notEquals(7,7));
        assertEquals(true, l1.greaterThanEquals(23,19));
        assertEquals(false, l1.greaterThanEquals(9,15));
    }
    
}
