import java.util.*;
class main{
    static void add(int r)
    {
        int a[]=new int[r];
        int rem=0,count=0,sum=0;
        for(int i=0;n!=0;i++)
        {
            rem=r%10;
            a[i]=rem;
            count++;
            r/=10;
        }
        for(int i=count-1;i>=0;i--)
        
            for(int j=i-1;j>=0;j--)
            sum+=a[i]+a[j];
            System.out.println(sum);
        
    
}
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int n= s.nextInt();
    add(n);
}
}
/*input : 234
output :18*/
