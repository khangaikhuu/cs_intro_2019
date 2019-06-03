
public class Gravity
{
    public double calcGravity(int m1,int m2, int r)
    {
        return 6.67259E-11 * ((m1 * m2)/(r * r));
    }
    
}
