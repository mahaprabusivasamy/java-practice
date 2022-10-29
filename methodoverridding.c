// You are using Java

import java.util.*;
import java.lang.Math.*;
class C
{
    double a,b;
    void area(double a,double b)
    {
        System.out.printf("%.2f",(Math.PI*a*a));
        System.out.println("");
    }
    void area1(double b)
    {
        System.out.printf("%.2f",(2*Math.PI*1.0*b)+(2*Math.PI*1.0*1.0));
        System.out.println("");
    }
    void volume(double b)
    {
        System.out.printf("%.2f",Math.PI*1.0*1.0*b);
    }
}
class Main{
    public static void main(String args[])
    {
        double a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextDouble();
        b=s.nextDouble();
        System.out.println("Circle: radius="+a+" color=red");
        System.out.println("Cylinder: radius=1.0 color=red height="+b);
        C c1=new C();
        c1.area(a,b);
        c1.area1(b);
        c1.volume(b);
    }
}
/*  input
4 10
output
Circle: radius=4.0 color=red
Cylinder: radius=1.0 color=red height=10.0
50.27   //area of circle
69.12   //area of cylinder
31.47   //volume of cylinder
