

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
    assertEquals (true, l1.isEqual (1,1));
    assertEquals (true, l1.lessThan (1,2));
    assertEquals (true, l1.lessThanOrEqual (1,2));
    assertEquals (true, l1.greaterThan (0,1));
    assertEquals (true, l1.notEquals (2,1));
    assertEquals (true, l1.greaterThanEquals (1,0));
    assertEquals (true, l1.isEqual (2,2));
    assertEquals (true, l1.lessThan (2,3));
    assertEquals (true, l1.lessThanOrEqual (1,2));
    assertEquals (true, l1.greaterThan (1,2));
    assertEquals (true, l1.notEquals (1,0));
    assertEquals (true, l1.greaterThanEquals (1,1));
}
}
