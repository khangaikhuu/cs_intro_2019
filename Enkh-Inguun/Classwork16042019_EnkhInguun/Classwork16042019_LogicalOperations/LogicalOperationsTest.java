

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogicalOperationsTest
{
    @Test
    public void testMyMethod()
    {
        LogicalOperations L1 = new LogicalOperations();
        assertEquals (true,L1.isEqual (1,1));
        assertEquals (true,L1.isEqual (2,2));
        assertEquals (true,L1.notEqual (3,2));
        assertEquals (true,L1.notEqual (1,4));
        assertEquals (true,L1.lessThan (1,4));
        assertEquals (true,L1.lessThan (1,6));
        assertEquals (true,L1.LessThanOrEqual (1,5));
        assertEquals (true,L1.LessThanOrEqual (1,1));
        assertEquals (true,L1.greaterThan (5,1));
        assertEquals (true,L1.greaterThan (9,1));
        assertEquals (true,L1.greaterThanOrEqual (5,1));
        assertEquals (true,L1.greaterThanOrEqual (1,1));
        
    }
}
