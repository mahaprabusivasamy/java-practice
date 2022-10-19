import java.util.*;
class Main
{
	public static void main(String[] args) {
      
int a;
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a<1 || a>52)
{
    System.out.println("Invalid input");

}
int arr[]=new int[a];
for(int i=0;i<a;i++)
{
arr[i]=s.nextInt();
if(arr[i]<1 || arr[i]>13)
{
    System.out.println("Invalid input");
   
}

}
int point_A=0,point_B=0;
for(int i=0;i<a;i++)
{
    if(i%2==0)
    {
        if(arr[i]==1&&arr[i+1]<11&&arr[i+1]!=1&&arr[i+2]<11&&arr[i+2]!=1&&arr[i+3]<11&&arr[i+3]!=1&&arr[i+4]<11&&arr[i+4]!=1)
     {
         System.out.println("Players A score 4 points");
         point_A=point_A+4;
     }        
      if(arr[i]==13&&arr[i+1]<11&&arr[i+1]!=1&&arr[i+2]<11&&arr[i+2]!=1&&arr[i+3]<11&&arr[i+3]!=11&&arr[i+3]!=1)
     {
         System.out.println("Players A score 3 points");
         point_A=point_A+3;
     }   
           if(arr[i]==12&&arr[i+1]<11&&arr[i+1]!=1&&arr[i+2]<11&&arr[i+2]!=1)
     {
         System.out.println("Players A score 2 points");
         point_A=point_A+2;
     }    
      if(arr[i]==11&&arr[i+1]<11&&arr[i+1]!=1)
     {
         System.out.println("Players A score 1 points");
         point_A=point_A+1;
     }       
    }
else{
        if(arr[i]==1&&arr[i+1]<11&&arr[i+1]!=1&&arr[i+2]<11&&arr[i+2]!=1&&arr[i+3]<11&&arr[i+3]!=1&&arr[i+4]<11&&arr[i+4]!=1)
     {
         System.out.println("Players B score 4 points");
         point_B=point_B+4;
     }        
      if(arr[i]==13&&arr[i+1]<11&&arr[i+1]!=1&&arr[i+2]<11&&arr[i+2]!=1&&arr[i+3]<11&&arr[i+3]!=11&&arr[i+3]!=1)
     {
         System.out.println("Players B score 3 points");
         point_B=point_B+3;
     }   
           if(arr[i]==12&&arr[i+1]<11&&arr[i+1]!=1&&arr[i+2]<11&&arr[i+2]!=1)
     {
         System.out.println("Players B score 2 points");
         point_B=point_B+2;
     }    
      if(arr[i]==11&&arr[i+1]<11&&arr[i+1]!=1)
     {
         System.out.println("Players B score 1 points");
         point_B=point_B+1;
     }       
    }
}
System.out.println("Player A"+point_A+"""point(s)");
System.out.println("Player B"+point_B+"""point(s)");



	}
}
