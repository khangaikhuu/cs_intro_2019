

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PerimeterOfRectangleTest
{
    @Test 
    public void TestPerimeterOfRectangle() 
    { 
        PerimeterOfRectangle c4 = new PerimeterOfRectangle(); 
        assertEquals(16, c4.PerimeterOfRectangle(6,2)); 
        assertEquals(14, c4.PerimeterOfRectangle(2,5)); 
        assertEquals(20, c4.PerimeterOfRectangle(3,7)); 
    } 
}
