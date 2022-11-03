import java.util.Stack;
import java.util.*;
class Main {
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        Stack<Integer> stk =new Stack<>();
        boolean result=stk.empty();
        System.out.println("stack is empty: ?"+result);
        stk.push(10);
        stk.push(20);
        stk.push(20);
        stk.push(50);
        stk.push(80);
        System.out.println("Elements in the stack: "+stk);
         result=stk.empty();
        System.out.println("stack is empty: ?"+result);
        System.out.println("peek element: "+stk.peek());
        System.out.println("size of stack: "+stk.size());
        
    }
}
//output:
/*
stack is empty: ?true
Elements in the stack: [10, 20, 20, 50, 80]
stack is empty: ?false
peek element: 80
size of stack: 5
*/
