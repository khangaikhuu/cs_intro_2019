

public class AreaofCircle
{
  private int r = 2;
  private double p = 3.14;
  private double area = 0.0;
  public int getR()
  {
      return r;
    }
  public double getP()
    {
        return p;
    }
    public double getArea(int radius)
  {
      area = p * r * r;
      return area;
    }
}
