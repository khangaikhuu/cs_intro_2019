

public class MyArray
{
    private int [] myArray1 = new int[5];
    private double [] myDoubleArray = {1.0,2.0,3.5,4.5,6.5};
    
    public int getSidesOfmyArray1()
    {
        return myArray1.length;
    }
    public int getSidesOfmyDoubleArray1()
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
