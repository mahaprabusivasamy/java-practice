// You are using Jav
import java.util.*;
abstract class A
{
   
   abstract void rectangle(double a,double b);
   abstract void square(double c);
}
class B extends A
{
    void rectangle(double a,double b)
    {
        System.out.println("area of Rectangle : "+a*b);
    }
    void square(double c)
    {
        double areaa=0;
        areaa=c*c;
        // if(areaa<10)
        // System.out.println("area of Square : "+String.format("%.1f",areaa));
        // else
        System.out.println("area of Square : "/*+String.format("%.2f",*/+areaa);
    }
}
class Demo
{
    public static void main(String args[])
    {
        B b1=new B();
        // A a=new A();
        Scanner s=new Scanner(System.in);
        double a,b,c;
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
        b1.rectangle(a,b);
        b1.square(c);
    }
}

/*
input :
10 20 
2
output :
area of traingle is = 200.0
area of square is = 4.0
*/
