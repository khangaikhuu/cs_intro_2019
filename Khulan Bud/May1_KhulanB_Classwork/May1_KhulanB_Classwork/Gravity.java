
public class Gravity
{
    private double m1;
    private double m2;
    private double r;
    public double CalcGravity(double m1, double m2, double r)
    {
        return 6.67408 * Math.pow(10, -11) * ((m1 * m2) / Math.pow(r, 2));
    }
}
