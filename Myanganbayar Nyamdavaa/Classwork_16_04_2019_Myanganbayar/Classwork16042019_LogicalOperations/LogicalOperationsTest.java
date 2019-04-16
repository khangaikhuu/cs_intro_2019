

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogicalOperationsTest
{
   @Test
   public void testMyMethod()
   {
       LogicalOperations Myangaa = new LogicalOperations();
       assertEquals(true, Myangaa.isEqual(1,1));
       assertEquals(false, Myangaa.isEqual(3, 7));
        
       assertEquals(true, Myangaa.lessThan(3, 4));
       assertEquals(false, Myangaa.lessThan(5, 5));
        
       assertEquals(true, Myangaa.lessThanOrEqual(8, 8));
       assertEquals(false, Myangaa.lessThanOrEqual(20, 2));
        
       assertEquals(true, Myangaa.greaterThan(7, 2));
       assertEquals(false, Myangaa.greaterThan(5, 8));
        
       assertEquals(true, Myangaa.notEquals(6, 5));
       assertEquals(false, Myangaa.notEquals(4, 4));
       
       assertEquals(true, Myangaa.greaterThanEquals(10, 5));
       assertEquals(false, Myangaa.greaterThanEquals(5, 10));
   }
}
