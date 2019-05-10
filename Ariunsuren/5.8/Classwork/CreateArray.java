

public class CreateArray
{
    private int[] myArray = new int[7];
    
   public void   ChangeMyValue( int number, int index  )
    {
        myArray[index] = number;
    }
    
    public int getElement(int index)
    {
        return myArray[index];
    }
    
}
