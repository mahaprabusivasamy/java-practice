import java.util.*;
class Main {   
      public static void validate(int age) {  
        if(age<18) {  
             throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
  
    public static void main(String args[]){  
      int a;
      Scanner ss=new Scanner(System.in);
      a=ss.nextInt();
        validate(a);  
        System.out.println("rest of the code...");    
  }    
}    
/*
INPUT: 13
OUTPUT: Exception in thread "main" java.lang.ArithmeticException: Person is not eligible to vote
    at Main.validate(Main.java:5)
    at Main.main(Main.java:16)
    
INPUT: 22
OUTPUT:
Person is eligible to vote!!
rest of the code...
    */
