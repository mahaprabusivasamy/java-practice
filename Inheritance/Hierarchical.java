import java.util.*;
class Monish
{
    void eat()
    {
        System.out.printf("hello");
    }                        
}
class Krishna extends Monish
{
    void time()
    {
        System.out.println("Hlo");  
    }
}
class Nekelash extends Monish
{
    void bark(){
  System.out.println("hi");
    }
}
class Main{
    public static void main(String args[])
    {
        Nekelash nn=new Nekelash();
        nn.bark();
        nn.eat();
    }
}
/*
  hi
  hello
*/
