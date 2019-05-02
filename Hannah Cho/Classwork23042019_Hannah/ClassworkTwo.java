

public class ClassworkTwo
{
 private int a;
 private String b;
 private double c;
 public ClassworkTwo(int par1, String par2, double par3)
 {
     a = par1;
     b = par2;
     c = par3;
    }
 public int getA()
 {
     return a;
    }
 public String getB()
 {
     return b;
    }
 public double getC()
 {
     return c;
    }
 public void setA(int par1)
 {
     a = par1;
    }
 public void setB(String par2)
 {
     b = par2;
    }
 public void setC(double par3)
    {
        c = par3;
    }
    public int loopNumbers(int loop)
 {
     for (int i = 1; i < 10; i++)
     {
         a = a + 5;
        }
        return a;
    }
 
}
