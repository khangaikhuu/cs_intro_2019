

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Exercise10Test
{
    @Test
    public void TestExercise10()
    {
        Exercise10 c1 = new Exercise10();
        assertEquals(true, c1.Exercise10(30, 40));
        assertEquals(true, c1.Exercise10(50, 60));
        assertEquals(false, c1.Exercise10(110, 120));
    }
}
