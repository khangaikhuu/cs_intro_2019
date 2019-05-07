
public class GiveMeMyElement
{
    private int[] myArray1 = {1, 2, 3, 4, 5, 6};
    private double[] myDoubleArray = {1.2, 3.4, 5.5, 2.5, 4.5, 5.6};
    public int getSizeOfmyArray1()
    {
        return myArray1.length;
    }
    public int getSizeOfmyDoubleArray()
    {
        return myDoubleArray.length;
    }
    public int getElement()
    {
        return myArray1[2];
    }
    public double getElement2()
    {
        return myDoubleArray[2];
    }
}
