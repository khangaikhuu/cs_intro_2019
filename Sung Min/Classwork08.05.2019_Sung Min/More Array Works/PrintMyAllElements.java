public class PrintMyAllElements
{
    private String[] myArray = {"hello", "World", "Test", "Final", "Exam", "Grades", "Failing Exam", "Graduation", "Preparation"};
    
    public void getAllElements()
    {
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.println(myArray[i]);
        }
    }
}
