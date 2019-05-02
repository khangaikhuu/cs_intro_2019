

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalcSubtractionTest
{
  @Test
    public void testCalcSubtraction()
    {
        CalcSubtraction s1 = new CalcSubtraction();
        assertEquals(0, s1.calcSubtraction(1,1));
        assertEquals(1, s1.calcSubtraction(2,1));
        assertEquals(2, s1.calcSubtraction(3,1));
    }  
}
