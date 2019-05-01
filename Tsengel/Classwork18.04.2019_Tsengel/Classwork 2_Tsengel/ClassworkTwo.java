
public class ClassworkTwo
{
    private int a = 2;
    private int b = 4;
    
    public ClassworkTwo(int x, int y)
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
    public int getLoop(int a)
    {
       int localVariable = 1;
       for (int i = 1; i <= a; i++)
       {
        localVariable = localVariable * a;
    }
    return localVariable;
    }
}
