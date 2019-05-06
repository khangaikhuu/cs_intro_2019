

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Exercise9Test
{
    @Test
    public void TestExercise9()
    {
        Exercise9 c1 = new Exercise9();
        assertEquals(false, c1.Equals(1, 2));
        assertEquals(true, c1.Equals(2, 2));
        assertEquals(false, c1.Equals(3, 4));
    }
}
