

public class CreateArray
{
    private int [] myArray = new int [7];
    public void createArray( int index, int number)
    {
        myArray[index] = number;
    }
    public int getElement(int index)
    {
        return myArray[index];
    }
}
