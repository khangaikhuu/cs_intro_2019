

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercise_TenTest
{
    @Test
    public void testExercise_TenTest()
    {
        Exercise_Ten e10 = new Exercise_Ten();
        assertEquals (true, e10.smaller(32,54));
        assertEquals (false, e10.smaller(369,37));
    }
}
