import java.util.*;
public class Main  
{  
public static void main(String[] args)   
{  
    Scanner s=new Scanner(System.in);
    int a,b,gcd=0;
    a=s.nextInt();
    b=s.nextInt();
for(int i = 1; i <= a && i <= b; i++)  
{  
    if(a%i==0 && b%i==0)  
gcd = i;  
}  
System.out.printf("GCD of %d and %d is: %d",a,b, gcd);  
}  
}  
