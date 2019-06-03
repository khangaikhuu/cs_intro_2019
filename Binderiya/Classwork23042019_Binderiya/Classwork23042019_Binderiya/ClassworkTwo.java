

public class ClassworkTwo
{
    private int a;
    private String myName;
    private double myMethod;
    
    public ClassworkTwo (int par1, String par2, double par3)
    {
        a = par1;
        myName = par2;
        myMethod = par3;
    }
    public int getA()
    {
        return a;
    }
    public String getmyName()
    {
        return myName;
    }
    public double getmyMethod()
    {
        return myMethod;
    }
    public void setA(int x)
    {
        a = x;
    }
    public void setmyMethod(double y)
    {
        myMethod = y;
    }
    public void setmyName(String s)
    {
        myName = s;
    }
    public int loopnumber(int a)
    {
        for (int i = 1; i<10; i++)
        {
            a = a + 5;
        }
        return a;
    }
}