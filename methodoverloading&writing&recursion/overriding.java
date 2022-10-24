import java.util.*;
class Main {static int Multiply(int a,int b)
{
    int c=a*b;
    return c;
}
 static double Multiply(double c,double d)
{
    double f=(c*d);
  return f;

}
public static void main(String[] args) 
    { 
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        double c = in.nextDouble();
        double d=in.nextDouble();
        Main m=new Main();
        System.out.println(m.Multiply(a, b)); 
        System.out.println(m.Multiply(c, d)); 
    } 
} 
