public class Main
{
	   public static void main(String[] args){
        double d = 234.04;
        long l = (long)d;   //explicit type casting
        int i = (int)l;     //explicit type casting
        System.out.println("double value " + d);
        System.out.println("long value " + l);
        System.out.println("int value " + i);
        System.out.println();
        System.out.println("NO explicit");
        int i1 = 300;
        long l1 = i;     //no explicit type casting
        float f1 = l;    //no explicit type casting
        System.out.println("int value " + i1);
        System.out.println("long value " + l1);
        System.out.println("float value " + f1);
    }
	
}

/*OUTPUT
int value 234.04
long value 234
float value 234

NO explicit
int value 300
long value 300
float value 300.0*/
