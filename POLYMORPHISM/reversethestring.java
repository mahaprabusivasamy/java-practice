// You are using Java
import java.util.*;
class Vehicle
{
    String ss;
    String bb;
   public void reverse(String a,String b)
    {
        this.ss=a;
        this.bb=b;
        System.out.println(this.bb+"\n"+this.ss);
    }
}
class Motorbike extends Vehicle
{
    public void reverse(int a,String b)
    {
        System.out.println(b);
        System.out.println(a);
    }

}
class Main
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        String a=ss.nextLine();
        String b=ss.nextLine();
        Motorbike m=new Motorbike();
        m.reverse(a,b);
    }
}
/*INPUT : VICKY 
          maha NEKE
  OUTPUT : maha NEKE
           VICKY*/
