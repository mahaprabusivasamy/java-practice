import java.util.*;
// import java.util.Stack;
class Main
{
    public static void main(String args[])
    {
        int a;
        int top=-1;
        Scanner n=new Scanner(System.in);
        a=n.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
           arr[i]=n.nextInt();
        }
        Stack <Integer> stk=new Stack<>();
        for(int i=0;i<a;i++){
      
      top++;
            stk.push(arr[i]);
    }
    int searchn=n.nextInt();
    System.out.println(stk.peek());
    stk.pop();
    top--;
    System.out.println("Top Element : "+arr[top]);
     
    try
    {
        if(stk.search(searchn)>0)
        System.out.println("Element is found at position : "+stk.search(searchn));
        else
        System.out.println("Element not found");
    }
catch(Exception e)
{
    System.out.println("Element not found");
}
    }
}
/*
input: 5 1 2 3 4 5 4
output:
5
Top element : 4
Elemen is found at position : 1

