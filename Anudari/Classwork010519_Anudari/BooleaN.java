

public class BooleaN
{
    private boolean equation;
    public boolean getEquation(boolean x, boolean y, boolean z)
    {
        equation = x && y && z || !(x) && !(y);
   
        return equation;
    }
}
