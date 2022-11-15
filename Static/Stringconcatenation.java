import java.util.*;
class Main{
    static void add(String a,String b)
    {
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        String name=ss.next();
        String name1=ss.next();
        Main.add(name,name1);
    }
}
