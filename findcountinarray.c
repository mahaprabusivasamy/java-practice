//qn:

import java.util.*;
class Main{
    public static void main(String args[])
    {
        int a,sum=0,i,j;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        int arr[][]=new int[a][a];
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                if(arr[i][j]!=20)
                {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
/*ans:prints the count of nuber not equa to 20
input:
2
20 20 
1 20
output:
1*/
