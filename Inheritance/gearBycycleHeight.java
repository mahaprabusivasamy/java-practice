import java.util.*;
class Bicycle
{int s,d,f;
    void display(int a,int b,int c)
    {
        this.s=a;
        this.d=b;
        this.f=c;
        System.out.println("No of gears are "+this.s);
        System.out.println("speed of bicycle is "+this.d);
        System.out.println("seat height is "+this.f);
    }
}
class MountainBike extends Bicycle
{
    void display(int a,int b,float c){
  System.out.println("No of gears are "+a);
System.out.println("speed of bicycle is "+b);
System.out.println("seat height is "+c);
}}
class Main{
    public static void main(String args[])
    {
    int a,b,c;
    Scanner ss=new Scanner(System.in);
    a=ss.nextInt();
    b=ss.nextInt();
    c=ss.nextInt();
    MountainBike mm=new MountainBike();
    mm.display(a,b,c);
    }
}
/*
INPUT:2 90 40
OUTPUT:No of gears are 2
speed of bicycle is 90
seat height is 40

INPUT:3 60 20
OUTPUT:No of gears are 3
speed of bicycle is 60
seat height is 20 
*/
