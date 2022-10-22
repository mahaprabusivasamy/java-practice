/*Datatype	Bits Acquired In Memory 
boolean	1
byte	8 (1 byte)
char	16 (2 bytes)
short	16(2 bytes)
int	32 (4 bytes)
long	64 (8 bytes)
float	32 (4 bytes)
double	64 (8 bytes)*/

import java.util.*;

public class Main {
	public static void main(String[] args)
	{
     	double sr;
		Scanner s=new Scanner(System.in);
		sr=s.nextDouble();
    	long l = (long)sr;
		int f = (int)l;
		System.out.println("Double value : " + sr);
		System.out.println("Long value : " + l);
		System.out.println("Int value : " + f);
	}
}
/*100.114 is input
Double value : 100.11;
Long value : 100;
Int value : 100;*/
