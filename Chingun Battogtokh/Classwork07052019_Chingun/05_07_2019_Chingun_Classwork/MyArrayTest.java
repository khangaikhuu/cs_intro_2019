

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyArrayTest
{ 
    @Test 
    public void TestMyArray() 
    { 
        MyArray c4 = new MyArray(); 
        assertEquals(5, c4.getSizeOfmyArray1()); 
        assertEquals(5, c4.getSizeOfmyDoubleArray()); 
        assertEquals(0, c4.getElement()); 
        assertEquals(2.0, c4.getElement2(),1); 
    } 
}
