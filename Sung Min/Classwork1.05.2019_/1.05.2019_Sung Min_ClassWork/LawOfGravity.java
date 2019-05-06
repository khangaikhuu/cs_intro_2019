public class LawOfGravity
{
    private double m1;
    private double m2;
    private double r;
    private double g;
    
    public double getGravity(double m1,double m2,double r,double g)
    {
        return g * ((m1 * m2) / (r * r));
    }
}
