

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ExerciseThreeTest
{
     @Test
    public void testThisMethod()
    {
         ExerciseThree c1 = new  ExerciseThree();
        assertEquals(2, c1.f(1, 1), 0.1);
        assertEquals(8, c1.f(2, 2), 0.1);
        assertEquals(18, c1.f(3, 3), 0.1);
    }
}
