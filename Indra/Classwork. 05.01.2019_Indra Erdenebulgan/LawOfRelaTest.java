

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LawOfRelaTest
{
   @Test
   public void TestLawOfRela()
   { 
       LawOfRela c4 = new LawOfRela(); 
       assertEquals(1.7987542E8, c4.LawOfRela(6),1); 
       assertEquals(2.09854657E8, c4.LawOfRela(7),1); 
       assertEquals(2.69813135E8, c4.LawOfRela(9),1); 
    }
}
