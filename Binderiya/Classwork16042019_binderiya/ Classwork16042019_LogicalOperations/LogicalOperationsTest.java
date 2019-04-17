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
        assertEquals(true, l1.lessThan(1,2));
        assertEquals(true, l1.lessThanorEquals(1,1));
        assertEquals(true, l1.greaterThan(3,1));
        assertEquals(true, l1.notEquals(3,1));
        assertEquals(true, l1.greaterThanEquals(3,1));
        assertEquals(true, l1.isEquals(2,2));
        assertEquals(true, l1.lessThan(1,2));
        assertEquals(true, l1.lessThanorEquals(1,1));
        assertEquals(true, l1.greaterThan(2,1));
        assertEquals(true, l1.notEquals(2,1));
        assertEquals(true, l1.greaterThanEquals(3,3));
        
    }
}
