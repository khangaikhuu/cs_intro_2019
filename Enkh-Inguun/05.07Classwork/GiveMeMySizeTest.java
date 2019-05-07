

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GiveMeMySizeTest
{
   @Test
    public void testArray()
    {
        GiveMeMySize ma = new GiveMeMySize ();
        assertEquals (11, ma.getSizeOfmyArray1());
        int [] t1 = {2,4,5};
        assertEquals (3, ma.getSize(t1));
        int [] t2 = {2,4,5,9};
        assertEquals (4, ma.getSize(t2));
        int [] t3 = {2,4,5,9,0};
        assertEquals (5, ma.getSize(t3));
        int [] t4 = {2,4,5,4,6,7};
        assertEquals (6, ma.getSize(t4));
        int [] t5 = {2,4};
        assertEquals (2, ma.getSize(t5));
        
       
        
    }
}
