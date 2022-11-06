class Green{
    void display()
    {
        System.out.println("Disply");
    }
}
class Dolphin extends Green
{
 void first()
{
System.out.println("First ");
}
}
class Dog extends Dolphin
{
 void vog()
{
System.out.println("Second ");
}
}
class Main{
public static void main (String[] args) {
    Dog dd=new Dog();
    dd.vog();
    dd.first();
    dd.display();
}
}/*
Second 
First
Disply
*/
