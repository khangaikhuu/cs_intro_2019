public class ClassworkTwo
{
    private int x = 2;
    private int y = 4;
    
    public ClassworkTwo(int x, int y)
    {
        x = x; 
        y = y;
    }
    
    public int getSum()
    {
        return x + y;
    }
    public int getProduct()
    {
        return x * y;
    }
    public int getLoop(int x)
    {
        int localVariable = 1;
        for (int i = 1; i <= x; i++)
        {
            localVariable = localVariable * x; 
        }
        return localVariable;
    }
}
