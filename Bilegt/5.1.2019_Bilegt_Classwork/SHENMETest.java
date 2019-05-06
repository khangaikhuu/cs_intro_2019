

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SHENMETest
{
    @Test
   public void SHENMETest() 
   { 
       SHENME n1 = new SHENME(); 
       assertEquals(3, n1.BigNum(2, 3)); 
       assertEquals(3, n1.BigNum(2, 3)); 
       assertEquals(4, n1.BigNum(3, 4)); 
    } 
}

