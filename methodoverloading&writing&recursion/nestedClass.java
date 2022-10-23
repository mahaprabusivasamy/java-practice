import java.util.*;
class outer
{
	static class inner
	{
    static void add(int a,int b)
  {
      int c=0;
      c=a+b;
      System.out.println(c);
  }
    		
	}
}
class Main
{
	public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in); 
	    int a = sc.nextInt();
	    int b = sc.nextInt();
		outer.inner.add(a,b);
	}
}
