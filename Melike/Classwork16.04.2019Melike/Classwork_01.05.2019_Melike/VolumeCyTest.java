

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VolumeCyTest
{
     @Test
   public void testVolumeCy ()
   {
       VolumeCy vcy = new VolumeCy();
       assertEquals(15.7, vcy.getVolumeCy(1, 5), 1);
       assertEquals(628, vcy.getVolumeCy(5, 8), 1);
       assertEquals(169.56, vcy.getVolumeCy(3, 6), 1);
    }
}
