

public class Cat
{
    public int legs = 4;
    public int age = 6;
    public boolean eatsMouse = true;
    public Cat()
    {
    }
    public Cat(int X, int Y, boolean Z)
    {
        legs = X;
        age = Y;
        eatsMouse = Z;
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
