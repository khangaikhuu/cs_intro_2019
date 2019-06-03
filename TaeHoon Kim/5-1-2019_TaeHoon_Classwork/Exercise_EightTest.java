

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercise_EightTest
{
     @Test
    public void testExercise_EightTest()
    {
        Exercise_Eight ln = new Exercise_Eight();
        assertEquals(5, ln.Larger(5,1));
        assertEquals(9, ln.Larger(9,3));
    }
}
