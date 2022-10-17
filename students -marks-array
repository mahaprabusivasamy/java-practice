import java.io.*;
import java.util.*;
class Student{
int rollno,m1,m2,m3,sum;
}
class Main
{
    public static void main(String args[])
    {
        int n,r1=0,r2=0,r3=0,r4=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        Student[] a=new Student[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new Student();
            a[i].rollno=s.nextInt();
            a[i].m1=s.nextInt();
            a[i].m2=s.nextInt();
            a[i].m3=s.nextInt();
            a[i].sum=a[i].m1+a[i].m2+a[i].m3;
            System.out.println(a[i].sum);
        }
        int hm1=a[0].m1;
        int hm2=a[0].m2;
        int hm3=a[0].m3;
        int hs=a[0].m1+a[0].m2+a[0].m3;
        for(int i=0;i<n;i++)
        {
            if(hm1<=a[i].m1)
            {
                hm1=a[i].m1;
                r1=a[i].rollno;
            }
            if(hm2<=a[i].m2)
            {
                hm2=a[i].m2;
                r2=a[i].rollno;
            }
            if(hm3<=a[i].m3)
            {
                hm3=a[i].m3;
                r3=a[i].rollno;
            }
            if(hs<=a[i].m1+a[i].m2+a[i].m3)
            {
                hs=a[i].m1+a[i].m2+a[i].m3;
                r4=a[i].rollno;
            }
        }
        System.out.println(r1+" "+hm1);
        System.out.println(r2+" "+hm2);
        System.out.println(r3+" "+hm3);
        System.out.println(r4+" "+hs);
    }
}
