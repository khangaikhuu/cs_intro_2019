public class PrintMyAllElements
{
    private String[] myArray = {"hello", "world", "Test", "Final", "exam", "Grades", "Failing Exams", "Graduation", "Preperation"};
    public void getAllElements()
    {
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.println(myArray[i]);
        }
    }
}
