import static java.lang.Math.pow;
public class Area_Circle
{
   private double radius;
   public double areaCalc(double radius)
   {
       double area = 0;
       area = 3.14159265359 * Math.pow(radius, 2);
       return area;
   }
}
