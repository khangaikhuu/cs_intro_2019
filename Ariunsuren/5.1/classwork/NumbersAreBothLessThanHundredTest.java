

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class NumbersAreBothLessThanHundredTest
{
    @Test
    public void testLessThan100()
    {
       NumbersAreBothLessThanHundred c1 = new NumbersAreBothLessThanHundred();
       assertEquals(true,c1.lessThanHundred(1,1));
       assertEquals(true,c1.lessThanHundred(2,2));
       assertEquals(true,c1.lessThanHundred(3,3));
    }
}
