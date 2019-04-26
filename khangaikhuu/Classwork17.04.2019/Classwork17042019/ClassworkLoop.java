

public class ClassworkLoop
{
   private int a = 0;
   
   public ClassworkLoop()
   {
   }
   public ClassworkLoop(int a)
   {
       a = a;
   }
   public String sayHello()
   {
       return "Hello!";
    }
    
   public int loopNumbers(int loop)
   {
       for (int i = 1; i <= loop; i++)
       {
           a = a + 2;
        }
       return a;
    }
}
