

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
       assertEquals(2, c4.BigNum(1, 2)); 
       assertEquals(3, c4.BigNum(2, 3)); 
       assertEquals(4, c4.BigNum(3, 4)); 
    } 
}
