
public class ClassworkTwo
{
    private float a;
    private double b;
    
    public ClassworkTwo(float a, double b)
    {
        a = a;
        b = b;
    }
    
    public float getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }
    public int getSum(int a, int b)
    {
        return a + b;
    }
    public int getQuotient(int a, int b)
    {
        return a * b;
    }
    
    public void setA(int a)
    {
        a = a;
    }
    public void setB(int b)
    {
        b = b;
    }
    
    
    public int ClassworkTwo(int loop)
    {
        int a = 0;
        for (int i = 1; i <= loop; i++)
        {
            a = a + 2;
        }
        return a;
    }
    
}
