

public class MyArray
{
    private int[] MyArray1 = new int[5];
    private double[] myDoubleArray = {1.0, 2.0, 3.5, 4.5, 6.5};
    public int getSizeOfMyArray1()
    {
        return MyArray1.length;
    }
    
    public int getSizeOfmyDoubleArray()
    {
        return myDoubleArray.length;
    }
    
    public int getElement()
    {
        return MyArray1[2];
    }
    
    public double getElement2()
    {
        return myDoubleArray[1];
    }
    
    
}
