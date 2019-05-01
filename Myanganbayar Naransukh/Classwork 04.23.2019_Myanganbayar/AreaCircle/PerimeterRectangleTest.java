

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerimeterRectangleTest
{
    @Test
    public void PerimeterRectangle()
    {
         PerimeterRectangle c3 = new PerimeterRectangle();
         assertEquals(20, c3.Perimeter(3,7));
         assertEquals(16, c3.Perimeter(3,5));
         assertEquals(14, c3.Perimeter(3,4)); 
        }
    }
