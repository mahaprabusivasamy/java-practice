import java.util.*;
class Map
{  
    int i;   
    public Map(int k)  
    {  
        i=k;  
    }  
    public Map(int k, int m)  
    {  
        System.out.println("Hi I am assigning the value max(k, m) to i");  
        if(k>m)  
        {  
            i=k;   
        }  
        else   
        {  
            i=m;  
        }  
    }  
}  
public class Main   
{  
    public static void main (String args[])   
    {  
        Scanner s=new Scanner(System.in);
       int a,b,c;
       a=s.nextInt();
       b=s.nextInt();
       c=s.nextInt();
        Map test1 = new Map(a);  
        Map test2 = new Map(b,c);  
        System.out.println(test1.i);  
        System.out.println(test2.i);  
    }  
}  
