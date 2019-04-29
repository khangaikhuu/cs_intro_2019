

public class ClassworkTwo
{
    private int a = 2;
    private int b = 1;
    public ClassworkTwo (int a, int b)
    {
        a = a;
        b = b;
    }
    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
    public int getAddition()
    {
        return a + b;
    }
    public int getMultiplication()
    {
        return a * b;
    }
     public int calcProduct(int e)
   {
        int o = 0;
        for (int i = 1; i < e; i++)
        {
            o = e * o;
        }
        return o;
    }
    
}
