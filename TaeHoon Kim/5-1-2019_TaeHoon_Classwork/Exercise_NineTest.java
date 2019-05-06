

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercise_NineTest
{
    @Test
    public void testExercise_NineTest()
    {
        Exercise_Nine e9 = new Exercise_Nine();
        assertEquals(true, e9.equal(1,1));
        assertEquals(true, e9.equal(3,3));
        assertEquals(false, e9.equal(3,2));
    }
}
