

public class Cat
{
 private int legs = 4;
 private int age = 10;
 private boolean eatsMouse = true;
 
 public boolean geteatsMouse()
 {
     return eatsMouse;
 }
 public  int getLegs()
 {
     return legs;
 }
 public Cat (int x, int y, boolean z)
 {
     legs = x;
     age = y;
     eatsMouse = z;
 }
 public int getAge()
 {
     return age;
 }
}
