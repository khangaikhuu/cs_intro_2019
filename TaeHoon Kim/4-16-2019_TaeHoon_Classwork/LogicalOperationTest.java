import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogicalOperationTest
{
    @Test
    public void testMyMethod()
    {
        LogicalOperation L1 = new LogicalOperation();
        assertEquals(true, L1.isEqual(2,2));
        assertEquals(true, L1.lessThan(2,4));
        assertEquals(true, L1.lessThanOrEqual(2,2));
        assertEquals(true, L1.greaterThan(4,2));
        assertEquals(true, L1.notEquals(6,2));
        assertEquals(true, L1.greaterThanEquals(8,4));
    }
}
