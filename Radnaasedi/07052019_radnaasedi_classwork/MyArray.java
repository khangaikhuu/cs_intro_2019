
public class MyArray
{
    private int[] myArray1 = new int[5];
    private double[] myDoubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
    public int getSizeOfMyArray1()
    {
        return myArray1.length;
    }
    public int getSizeOfMyArray2()
    {
        return myDoubleArray.length;
    }
    public int getElement()
    {
        return myArray1[2];
    }
    public double getElement2()
    {
        return myDoubleArray[1];
    }
}
