import java.util.*;
public class Main
{
    void display(int a,String str)
    {
        System.out.println(a);
        System.out.println(str);
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		String str;
		a=s.nextInt();
		str=s.nextLine();
		Main b=new Main();
		b.display(a,str);
	}
}
//INPUT: 5 Mohan
//OUTPUT : 5 Mohan
