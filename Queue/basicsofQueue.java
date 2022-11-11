import java.util.*;
class Main
{
    public static void main(String args[])
    {
       Scanner ss=new Scanner(System.in);
       int a=ss.nextInt();   
        int arr[]=new int[a];
        Queue <Integer> neke=new LinkedList<>();
        for(int i=0;i<a;i++)
        {
           arr[i]=ss.nextInt();
           neke.add(arr[i]);
        }
        System.out.println(neke);
        System.out.println("removed element : "+neke.remove());
        System.out.println(neke);
        System.out.println("head of the queue : "+neke.peek());
        System.out.println("Size of the queue : "+neke.size());
        int s=ss.nextInt();
        if(neke.contains(s))
        {
            System.out.println("The element is present.");
        }
        else
        System.out.println("The element is not present.");
    }
}
/*
Input:5
1
2
3
4
5
4
output:
[1, 2, 3, 4, 5]
removed element : 1
[2, 3, 4, 5]
head of the queue : 2
Size of the queue : 4
The element is present. */
