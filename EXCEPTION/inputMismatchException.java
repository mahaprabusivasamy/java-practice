import java.util.*;
import java.lang.*;
import java.util.InputMismatchException;
class Main
{
public static void main(String args[])
{
        Scanner s=new Scanner(System.in);
        int a;
        try{
        a=s.nextInt();
        
        System.out.println(a);
    }
    catch(InputMismatchException e)
    {
        System.out.println("java.util.InputMismatchException");
    }
}
}
