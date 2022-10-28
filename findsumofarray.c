// You are using Java
import java.util.*;
class Main{
    public static void main(String args[])
    {
        int a,sum=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        int arr[][]=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(arr[i][j]!=20)
                {
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
/* input:
3
20 20 1
2 4 20
20 20 1
output:
8    */
