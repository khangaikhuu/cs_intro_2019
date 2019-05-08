

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeElementWithIndexTest
{
    @Test
    public void TestGiveMeElementWithIndex() 
    { 
        GiveMeElementWithIndex c4 = new GiveMeElementWithIndex();
        int[] test1 = {1, 2}; 
        assertEquals(2, c4.Element(test1, 1));
        int[] test2 = {1, 2, 3};
        assertEquals(3, c4.Element(test2, 2)); 
        int[] test3 = {1, 2, 3, 4};
        assertEquals(4, c4.Element(test3, 3)); 
    } 
}
