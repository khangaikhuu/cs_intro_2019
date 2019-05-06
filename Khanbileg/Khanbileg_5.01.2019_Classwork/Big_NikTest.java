

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Big_NikTest
{
    @Test
   public void TestBigNum() 
   { 
       Big_Nik c4 = new Big_Nik(); 
       assertEquals(6, c4.BigNik(2, 6)); 
       assertEquals(4, c4.BigNik(3, 4)); 
       assertEquals(5, c4.BigNik(5, 3)); 
    } 
}
