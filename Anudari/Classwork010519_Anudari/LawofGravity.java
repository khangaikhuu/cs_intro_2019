

public class LawofGravity
{
  private int Fg;
  public int getGravity(int g, int m1, int m2, int r2)
  {
      Fg = g *(m1*m2/r2);
      return Fg;
    }
}
