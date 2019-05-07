

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class calculatessubtractionofgiven2numbersTest
{
    @Test
   public void testcalculatessubtractionofgiven2numbers()
   {
      calculatessubtractionofgiven2numbers c4 = new calculatessubtractionofgiven2numbers();
      assertEquals(6, c4.calculatessubtractionofgiven2numbers(8,2));
      assertEquals(8, c4.calculatessubtractionofgiven2numbers(9,1));
      assertEquals(10, c4.calculatessubtractionofgiven2numbers(12,2));
    }
}
