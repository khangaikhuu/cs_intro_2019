

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BigNumTest
{
   @Test
   public void TestBigNum() 
   { 
       BigNum c4 = new BigNum(); 
       assertEquals(6, c4.BigNum(2, 6)); 
       assertEquals(4, c4.BigNum(3, 4)); 
       assertEquals(5, c4.BigNum(5, 3)); 
    } 
}
