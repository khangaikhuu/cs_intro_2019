

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementWithIndexTest
{
    @Test
    public void TestMyMethod()
    {
        GiveMeMyElementWithIndex i1 = new GiveMeMyElementWithIndex();
        int [] test1 = {1,2,2,4,5};
        assertEquals(2, i1.getMyArray(test1,2));
        int [] test2 = {1,5,6,8};
        assertEquals(8, i1.getMyArray(test2,3));
        int [] test3 = {2,3,4};
        assertEquals(4, i1.getMyArray(test3,2));
    }
}
