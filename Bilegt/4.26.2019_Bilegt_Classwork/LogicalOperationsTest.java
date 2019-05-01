

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
        assertEquals (true, l1.isEqual (1,11));
        assertEquals (true, l1.lessThan (1,11));
        assertEquals (true, l1.lessThanOrEqual (1,11));
        assertEquals (true, l1.greaterThan (1,11));
        assertEquals (true, l1.notEquals (1,11));
        assertEquals (true, l1.greaterThanEquals (1,11));
        assertEquals (true, l1.isEqual (1,11));
        assertEquals (true, l1.lessThan (1,11));
        assertEquals (true, l1.lessThanOrEqual (1,11));
        assertEquals (true, l1.greaterThan (1,11));
        assertEquals (true, l1.notEquals (1,11));
        assertEquals (true, l1.greaterThanEquals (1,11));
    }
}
