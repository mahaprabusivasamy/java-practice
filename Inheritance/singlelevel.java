import java.util.*;
class Aham
{
    void bark()
    {
        System.out.println("very Much...");
    }
}
class Maha extends Aham 
{ 
    void eat()
    {
        System.out.println("eating...");
    }
}
class Main{
public static void main (String[] args) {
    Maha mm=new Maha();
    mm.bark();
    mm.eat();
}
}
/*
Outpt: 
very Much...
eating...
