
public class ClassworkThree
{
   private int a = 0;
   public int getI(int a)
   {
       return a;
   }
   public int loopI(int l)
   {
       for (int i = 1; i <= l; i++)
       {
           a = a + 1;
       }
       return a;
   }
}

/*
 * Few questions: 1. What happens if we start loop from 0 (int i = 0)?
                  2. I think we assign a value for "l" from the test class, then
                  "l" will restricts the "i" value, which restricts the loop times. Is this conception correct?
 */
