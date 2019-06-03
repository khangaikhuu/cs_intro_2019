

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMyElementWithIndexTest
{
    @Test
    public void testGiveMyElementWithIndex()
    {
        GiveMeMyElementWithIndex ewi = new GiveMeMyElementWithIndex();
        int[] myArray = {1, 2, 3, 4, 5};
        assertEquals(1, ewi.giveMyElementWithIndex(0, myArray));
        assertEquals(2, ewi.giveMyElementWithIndex(1, myArray));
        assertEquals(5, ewi.giveMyElementWithIndex(4, myArray));
    }
}
