

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ExerciseFourTest
{
     @Test
    public void testThisMethod()
    {
        ExerciseFour c1 = new ExerciseFour();
        assertEquals(true, c1.f(true, true, true));
        assertEquals(true, c1.f(false, false, false));
        assertEquals(false, c1.f(true, false, true));
        
    }
}
