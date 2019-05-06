

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LawofRelativityTest
{
   @Test 
   public void testMyMethod()
   {
       LawofRelativity l1 = new LawofRelativity();
       assertEquals(648,l1.getEnergy(8,9));
       assertEquals(150,l1.getEnergy(6,5));
       assertEquals(392,l1.getEnergy(8,7));
    }
}
