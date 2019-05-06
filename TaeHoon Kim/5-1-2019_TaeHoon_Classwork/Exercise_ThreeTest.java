

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercise_ThreeTest
{
    @Test
    public void testExercise_ThreeTest()
    {
        Exercise_Three e1 = new Exercise_Three();
        assertEquals(13, e1.Fx(3, 2));
    }
}
