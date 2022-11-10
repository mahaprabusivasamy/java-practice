import java.util.*;
class Main{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
 int a=s.nextInt();
if(a>0){
if(a>=85)
{
System.out.println("A");
}
else if(a>=75)
{
System.out.println("B");
}
else if(a>=65)
{
System.out.println("C");
}
else 
System.out.println("D");
}
else
System.out.println("Invalid");
}
}
/*
88
A
*/
