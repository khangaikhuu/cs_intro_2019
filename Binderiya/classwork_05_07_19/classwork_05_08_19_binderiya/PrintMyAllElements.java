

public class PrintMyAllElements
{
    private String[] myArray = {"hello", "World", "Final", "Exam", "Grade", "Failing Exam", "Graduation", "Preparation"};
    public void getMyAllElements()
    {
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.println(myArray[i]);
        }
    }
}