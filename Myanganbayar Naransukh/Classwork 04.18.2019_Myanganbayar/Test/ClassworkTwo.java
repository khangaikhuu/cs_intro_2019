public class ClassworkTwo
{
    private int a;
    private int b;
    public ClassworkTwo(int c, int d)
    {
        a = c;
        b = d;
    }
    public int getA(int a)
    {
        return a;
    }
    public int getB(int b)
    {
        return b;
    }
    public int getSum(int a, int b)
    {
        return a + b;
    }
    public int getProduct(int a, int b)
    {
        return a * b;
    }
    public int calcProduct(int e)
    {
        int o = 0;
        for (int i = 1; i < 2; i++)
        {
            o = e * o;
        }
        return o;
    }
}

