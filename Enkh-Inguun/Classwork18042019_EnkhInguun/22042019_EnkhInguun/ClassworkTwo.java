

public class ClassworkTwo
{
   private int a = 1;
   private int b = 2;
   public ClassworkTwo (int a, int b)
   {
       a = a;
       b = b;
    }
    public int getSum()
    {
        return a + b;
    }
    public int getMultiplication ()
    {
        return a * b;
    }
    public int getLoop ( int loop)
    {
        for (int i = 1; i <= loop; i++)
        {
            a = a + 2;
        }
        return a;
    }
}
