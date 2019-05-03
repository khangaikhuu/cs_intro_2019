package Classwor;



public class ClassworkOne
{
    private int a ;
   public ClassworkOne(int c)
   {
       a = c;
   }
   public int getA(int a)
   {
       return a;
   }
   public int getE(int number, int exponent)
   {
       int result = 1;
       for (int i = 0; i < exponent; i++)
       {
          result = result * number;
       }
       return result;
   }
}
