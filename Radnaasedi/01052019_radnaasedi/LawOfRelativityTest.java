

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LawOfRelativityTest
{
   @Test
   public void LawOfRelativity()
   { 
       LawOfRelativity c4 = new LawOfRelativity(); 
       assertEquals(1.7987542E8, c4.lawOfRelativity(6),1); 
       assertEquals(2.09854657E8, c4.lawOfRelativity(7),1); 
       assertEquals(2.69813135E8, c4.lawOfRelativity(9),1); 
    }
   
   
}
