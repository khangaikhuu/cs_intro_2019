
public class ClassworkTwo
{
    private int i;
    private String s;
    private double d;
    public ClassworkTwo(int par1, String par2, double par3)
    {
        i = par1;
        s = par2;
        d = par3;
    }
    public int getI(int i)
    {
        return i;
    }
    public String getS(String s)
    {
        return s;
    }
    public double getD(double d)
    {
        return d;
    }
    public void setI(int j)
    {
        j = i;
    }
    public void setS(String k)
    {
        k = s;
    }
    public void setD(double l)
    {
        l = d;
    }
    public int Something()
    {
        int x = 0;
        for(i = 1; i < 10; i++)
        {
            x = x + 5;
        }
        return x;
    }
}
