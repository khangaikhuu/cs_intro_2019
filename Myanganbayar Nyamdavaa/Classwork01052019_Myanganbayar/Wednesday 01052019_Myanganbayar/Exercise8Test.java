

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Exercise8Test
{
    @Test
    public void TestExercise8()
    {
        Exercise8 c1 = new Exercise8();
        assertEquals(2, c1.Exercise8(1, 2));
        assertEquals(3, c1.Exercise8(2, 3));
        assertEquals(4, c1.Exercise8(3, 4));
    }
}
