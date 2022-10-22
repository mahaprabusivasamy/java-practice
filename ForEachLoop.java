///For each loop
import java.util.*;
class Main
{
	public static void main(String[] arg)
	{
		{
		    	Scanner s= new Scanner(System.in);
		    int a;
		    a=s.nextInt();
			int marks[]=new int[a];
		
			for(int i=0;i<a;i++)
			{
			    marks[i]=s.nextInt();
			}
			int highest_marks = maximum(marks);
			System.out.println("The highest score is :" + highest_marks);
		}
	}
	public static int maximum(int[] numbers)
	{
		int maxSoFar = numbers[0];
		for (int num : numbers)
		{
			if (num > maxSoFar)
			{
				maxSoFar = num;
			}
		}
	return maxSoFar;
	}
}
/*4 
10 20 90 11
The highest score is :90*/

//for more topics, give a star to cheer up me//
