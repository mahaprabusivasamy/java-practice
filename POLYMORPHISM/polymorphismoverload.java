// You are using Java
import java.util.*;
class Hello
{
    public void fun1(int a,int b,int c)
    {
    System.out.println(a*b*c);
    }
    public void fun1(int a,int b)
    {
        System.out.println(a+b);
    }
}
class Main{
    
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        int a=ss.nextInt();
        Hello hh=new Hello();
        int arr[]=new int[a];
        if(a==2){
        for(int i=0;i<a;i++)
        {
            arr[i]=ss.nextInt();
        }
        hh.fun1(arr[0],arr[1]);
        }
        else if(a==3)
        {
            for(int i=0;i<a;i++)
            {
                arr[i]=ss.nextInt();
            }
            hh.fun1(arr[0],arr[1],arr[2]);
        }
       else if(a>3)
       {
           System.out.println("WRONG INPUT");
       }
    }
}

/*
INPUT: 3 1 2 3   OUTPUT: 6
INPUT: 14 56     OUTPUT: 70
INPUT: 4 12 11 14 12 OUTPUT: WRONG INPUT
