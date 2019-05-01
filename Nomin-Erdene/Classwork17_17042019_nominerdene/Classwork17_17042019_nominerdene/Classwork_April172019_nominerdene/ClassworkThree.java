
public class ClassworkThree
{
   private int a;
   
   public int getA()
   {
       return a;
   }
   public void setA()
   {
       a = a;
   }
   
   private int b = 1;
   public int loopNumbers(int loop)
   {
       for (int i = 1; i <= loop; i++)
       {
           b = b + 1;
       }
       return b;
   }
}
