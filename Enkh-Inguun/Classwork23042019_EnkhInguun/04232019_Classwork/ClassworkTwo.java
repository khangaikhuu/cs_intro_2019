
public class ClassworkTwo
{
    private int a = 4;
    private String b = "k";
    private double c = 12.2;
    
    public ClassworkTwo ( int par1, String par2, double par3)
    {
        a = par1;
        b = par2;
        c = par3;
    }
    public int getA ()
    {
        return a;
    }
    public String getB ()
    {
        return b;
    }
    public double getC ()
    {
        return c;
    }
    public void setA (int sip)
    {
        a = sip;
    }
    public void setB (String hh)
    {
        b = hh;
    }
    public void setC (double kg)
    {
        c = kg;
    }
    public int loop (int a)
    {
      
        for (int i = 1; i <10; i++)
        {
            a = a + 5;
        }
        return a;
    }
    
}