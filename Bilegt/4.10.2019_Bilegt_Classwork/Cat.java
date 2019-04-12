
public class Cat
{
    public int legs = 4;
    public int age = 10;
    public boolean eatsMouse = true;
    
    public Cat()
    {
    }
    public Cat(int a, int b, boolean z)
    {
        legs = a;
        age = b;
        eatsMouse = z;
    }
    public int legs()
    {
        return legs;
    }
    public int age()
    {
        return age;
    }
    public boolean eatsMouse()
    {
        return eatsMouse;
    }
}
