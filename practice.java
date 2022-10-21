public class Main
{
	public static void main(String[] args) {
	    int a=29,b,sum=0,re;re=a;
	   while(re>0)
	   {
	     b=re%10;
	      sum+=Math.pow(b,3);
	      re =re/10;

	   
	   }
	   if(sum==re)
	   {
	       System.out.println(a+"is a armstrong number");
	   }
	   else
	   System.out.println(a+"is not an armstrong number");

	   
	}
}
