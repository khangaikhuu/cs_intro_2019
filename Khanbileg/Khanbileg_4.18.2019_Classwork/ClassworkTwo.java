
public class ClassworkTwo
{
    private int a;
    private int b;
    public ClassworkTwo(int a, int b)
    {
       a = a;
       b = b;
    }
    public int getSum()
    {
        return a + b;
    }
    public int getProduct()
    {
        return a * b;
    }
    private int c = 0;
    public int loopNumbers(int loop)
   {
        for (int i = 1; i<= loop; i++)
    {
        c = c + 2;
    }
    return c;
  }
}
   
