

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LogicalOperationsTest
{
    @Test 
    public void testMyMethod()
    { 
        LogicalOperations C1 = new LogicalOperations(); 
        assertEquals(true, C1 .isEqual(2,2));
        assertEquals(true, C1 .lessThan(2,3)); 
        assertEquals(true, C1 .lessThanOrEqual(3,3)); 
        assertEquals(true, C1 .greaterThan(4,3));
        assertEquals(true, C1 .notEquals(2,6)); 
        assertEquals(true, C1 .greaterThanEquals(5,2));
        assertEquals(true, C1 .isEqual(4,4)); 
        assertEquals(false, C1 .lessThan(4,3));
        assertEquals(true, C1 .lessThanOrEqual(6,6));
        assertEquals(true, C1 .greaterThan(7,5));
        assertEquals(true, C1 .notEquals(9,11)); 
        assertEquals(true, C1 .greaterThanEquals(11,9));
    } 
        
        
    
    
}
