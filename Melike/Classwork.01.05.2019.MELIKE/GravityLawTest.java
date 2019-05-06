

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GravityLawTest
{
     @Test
   public void testGravityLaw ()
   {
       GravityLaw gl = new GravityLaw();
       assertEquals(24, gl.getGravityLaw(4, 3, 2, 1), 1);
       assertEquals(15, gl.getGravityLaw(5, 4, 3, 2), 1);
       assertEquals(12, gl.getGravityLaw(6, 5, 4, 3), 1);
    }
}
