

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sum_Of_First_Hundred_NumbersTest
{
    @Test
    public void testSum_Of_First_Hundred_Numbers()
    {
        Sum_Of_First_Hundred_Numbers s1 = new Sum_Of_First_Hundred_Numbers();
        assertEquals(5050, s1.first100());
    }
}
