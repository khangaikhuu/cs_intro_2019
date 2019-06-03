
public class CalcGrav
{
    public int m1;
    public int m2; 
    public int r; 
    public double CalcGrav(int m1, int m2, int r) 
    { 
        return (m1 * m2) / (r * r) * 6.67259 * 10-11; 
    } 
}
