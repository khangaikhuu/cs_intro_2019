public class ClassworkThree
{
   private int x = 2;
   
   public int getX()
   {
       return x;
   }
   public int multiplication(int parameter)
   {
       int c = 1;
       for(int i = 2; i <= parameter; i++)
       {
           c = c + x;
       }
       return c;
   }
}
