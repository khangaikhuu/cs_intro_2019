
/**
 * Write a description of class First here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class First
{
    // instance variables - replace the example below with your own    private int x +
    private int x = 100;
    private double y = 10.0;
    private float z = 20.0f;
    private String text = "Txt";
    private boolean isTrue = false;
    private char c = 'c';
    private long l = 123123123;

    /**
     * Constructor for objects of class First
     */
    public First()
    {
        // initialise instance variables
        x = 0;
    }
    public First(int a, double e)
    {
     x = x + a;
     y = y + e;
     
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
