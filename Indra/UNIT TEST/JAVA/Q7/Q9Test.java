import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q9Test
{
  public void Q9 ()
  {
      Q9 l1 = new Q9();
       assertEquals(true, l1.Q9(true,true));
       assertEquals(false, l1.Q9(false,false));
       assertEquals(true, l1.Q9(true,false));
  }
}
