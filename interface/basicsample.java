import java.util.*;
interface Mass{
       void display();
       void print();
}
interface Hero{
    void display1();
    void print1();
   
}
class Good implements Mass
{
    public void display(){
         System.out.println("hi krish what doing");
     }
    public void print(){
         System.out.println("hi mathan don't call tdy ");
    }
    
}
class Bad implements Mass,Hero{
    public void display1()
     {
         System.out.println("hey dude maha your ending mobile number is 92 is it crt?");
     }
   public void print1(){
                 System.out.println("hey dude niki you have 6 girl friends is it crt?");
 }
 public void display(){
         System.out.println("hi kavin your room no is 27 is it crt?");
     }
   public void print(){
         System.out.println("hi ram i call you later");
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
// 		int a,b;
// 		a=s.nextInt();
// 		b=s.nextInt();
		Good gs=new Good();
		Bad bs=new Bad();
		gs.display();
		gs.print();
		bs.display1();
		bs.print1();
	    bs.display();
		bs.print();
		
		
	}
}
/*

output:
hi krish what doing
hi mathan dont't call tdy
hey dude maha your mobile number is 92 is it crt?
hey dude niki you have 6 girl friends is it crt?
hi kavin your room no is 27 is it crt?
hi ram i call you later 
*/

