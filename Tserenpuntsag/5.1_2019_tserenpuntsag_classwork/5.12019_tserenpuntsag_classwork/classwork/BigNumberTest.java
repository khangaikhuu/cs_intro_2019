package classwork;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BigNumberTest
{
   @Test
   public void TestBigNum() 
   { 
       BigNumber n1 = new BigNumber(); 
       assertEquals(2, n1.BigNumber(1, 2)); 
       assertEquals(3, n1.BigNumber(2, 3)); 
       assertEquals(4, n1.BigNumber(3, 4)); 
    } 
}
