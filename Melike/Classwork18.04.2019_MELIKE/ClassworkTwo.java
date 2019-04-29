

public class ClassworkTwo
{
   private int a;
   private int b;
   public ClassworkTwo(int aa, int bb)
   {
       a = aa;
       b = bb;
    }
   public int getA()
    {
        return a;
    }
   public int getB()
    {
        return b;
    }
   public int getSum(int par1, int par2)
    {
        return par1 + par2;
    }
   public int getMult(int par1, int par2)
    {
        return par1 * par2;
    }
   public int getAnswer(int e)
    {
        int m = 0;
        for (int i = 1; i < 2; i++)
        {
            m = e * m;
        }
        return m;
    }
}
