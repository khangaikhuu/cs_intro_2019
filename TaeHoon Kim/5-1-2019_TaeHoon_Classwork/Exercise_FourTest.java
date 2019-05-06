

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercise_FourTest
{
     @Test
    public void testExercise_FourTest()
    {
        Exercise_Four e1 = new Exercise_Four();
        assertEquals(false, e1.Not(true, true, false));
        assertEquals(true, e1.Not(false, false, true));
    }
}
