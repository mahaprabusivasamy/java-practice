import java.util.*;
class Neke{  
  
    public static void main(String[] args) {  
        Scanner ss=new Scanner(System.in);
        try  
        {  
        int data=ss.nextInt();
        data=data/0;
        }  
           
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  
/*
INPUT:50
OUTPUT:
java.lang.ArithmeticException: / by zero
rest of the code
*/
