import java.util.*;
class Hello
{
    void sayHello(String name)
    {
        System.out.println("Hello");
        System.out.println("Hello "+name);
    }
    
}
class Main
{
    public static void main(String args[])
    {
        String name;
        Scanner s=new Scanner(System.in);
        name=s.nextLine();
        Hello h=new Hello();
        h.sayHello(name);
    }
}
/*
input:deva
output:
Hello
Hello deva*/
