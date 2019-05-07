import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class GiveMeMyElementWithIndexTest
{
    @Test
    public void testGiveMyElementWhitIndex()
    {
        GiveMeMyElementWithIndex ewi = new GiveMeMyElementWithIndex();
        int[] myArray = {1, 2, 3, 4, 5};
        assertEquals(1, ewi.GiveElementWithIndex(0, myArray));
        assertEquals(2, ewi.GiveElementWithIndex(5, myArray));
        assertEquals(1, ewi.GiveElementWithIndex(4, myArray));
    }
}
