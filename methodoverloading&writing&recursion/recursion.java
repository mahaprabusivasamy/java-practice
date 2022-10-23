import java.util.*;
class Main{
static int fac(int a)
{
    if(a==1)
    {
        return 1;
    }
    else
   return (a*fac(a-1));
}

    public static void main(String args[])
    {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
       int fact=1;
       fact=fac(a);
       System.out.println(fact);
    }
}
/*
input:5
Output:120
*/
