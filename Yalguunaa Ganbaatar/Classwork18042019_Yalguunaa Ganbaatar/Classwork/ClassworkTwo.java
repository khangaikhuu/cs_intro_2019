
public class ClassworkTwo
{
    private int tattoo;
    private int chucky;
    public ClassworkTwo(int wei, int shenme)
    {
        tattoo = wei;
        chucky = shenme;
    }
    public int getFreedom(int tattoo)
    {
        return tattoo + chucky;
    }
    public int getAbs(int chucky)
    {
        return tattoo * chucky;
    }
    public int getGirlz(int par)
    {
        int gee = 1;
        for (int i = 1; i <= par; i++)
        {
          gee = par * gee;
        }
       return gee;
    }
}
