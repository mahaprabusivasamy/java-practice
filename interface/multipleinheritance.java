// You are using Java
import java.util.*;
class Place
{
    Place()
    {
        System.out.print("PLACE :");
    }
}
class Weekdays extends Place
{
    Weekdays()
    {
        System.out.println(" I choose Weekdays");
    }
}
class Shuffle extends Place
{
    Shuffle()
    {
        System.out.println(" I choose Shuffle");
    }
}
class Main{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        int a=ss.nextInt();
        if(a<6){
        Weekdays w=new Weekdays();
        }
        else if(a>=6){
        Shuffle s=new Shuffle();
}
    }
}
/*
INPUT:3
OUTPUT:Place : I choose Seekdays
INPUT:6
OUTPUT:Place : I choose Shuffle */
