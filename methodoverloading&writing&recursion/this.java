import java.util.*;

class Box
{
    double a,b,c;
    void area()
    {
        double area1; 
        area1=this.a*this.b;
        System.out.println(area1);
    }
    void volume()
    {
        double vol;
        vol=this.a*this.b*this.c;
        System.out.println(vol);
    }
    
}
class Main{
public static void main (String[] args) {
    double a,b,c;
    Box be= new Box();
    Scanner s=new Scanner(System.in);
    be.a=s.nextDouble();
    be.b=s.nextDouble();
    be.c=s.nextDouble();

    be.area();
    be.volume();
}
}
