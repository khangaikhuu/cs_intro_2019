
public class ChangeMyValue
{
    public int [] myArray = {1, 2, 3, 4, 19, 25, 23, 45, 12, 58, 14};
    public void ChangeMyValue(int numbers, int index)
    {
        myArray [index] = numbers;
    }
    public int getElement(int index)
    {
        return myArray[index];
    }
}
