public class Main
{
	public static void main(String[] args) {
	    int a=29,b,sum=0,r;
		r=a;
	   while(r>0)
	   {
	     b=r%10;
	      sum+=Math.pow(b,3);
	      r =r/10;

	   
	   }
	   if(sum==r)
	   {
	       System.out.println(a+"is a armstrong number");
	   }
	   else
	   System.out.println(a+"is not an armstrong number");

	   
	}
}
