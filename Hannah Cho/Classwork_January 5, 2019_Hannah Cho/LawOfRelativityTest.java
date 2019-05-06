

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class LawOfRelativityTest
{
 @Test
 public void TestMyMethod()
 {
     LawOfRelativity r1 = new LawOfRelativity();
     assertEquals(100.0, r1.getE(4,5), 1);
     assertEquals(324.0, r1.getE(9,6), 1);
     assertEquals(98.0, r1.getE(2,7), 1);
    }
     
}
