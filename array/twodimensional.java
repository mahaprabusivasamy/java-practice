import java.util.*;
public class Main
{
	public static void main(String args[]) {
		int arr[][]=new int[3][3];
		Scanner ss=new Scanner(System.in);
    int a=ss.nextInt();
		for(int i=0;i<a;i++)
		{
		    for(int j=0;j<a;j++)
		    {
		        arr[i][j]=ss.nextInt();
		    }
		}
			for(int i=0;i<a;i++)
		{
		    for(int j=0;j<a;j++)
		    {
		System.out.print(arr[i][j]+" ");
		    }System.out.println(" ");
		}
	}
}
/* input 
3
1 2 3
4 5 6
7 8 9

Output:

1 2 3
4 5 6
7 8 9
*/
