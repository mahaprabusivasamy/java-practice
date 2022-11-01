import java.util.*;
class Main{
public static void main (String[] args) {
    
       int a,b;
       Scanner s=new Scanner(System.in);
       a=s.nextInt();
       b=s.nextInt();
       int arr[][]=new int[a][b];
     for(int i=0;i<a;i++)
     {
         for(int j=0;j<b;j++)
         {
             if(i%2==0 && j%2==0)
             System.out.print("* ");
             else
             System.out.print("# ");
          
         }
         System.out.println(" ");
     }
       
    }
}
