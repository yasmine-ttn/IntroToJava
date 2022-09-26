import java.util.Scanner;

public class PersonalInfo {
    static String FirstName;
    static String LastName;
    static int age;
    static void getInfo(String fn,String ln,int a)
    {
        FirstName=fn;
        LastName=ln;
        age=a;
    }
    static void printInfo()
    {
        System.out.println("First name:"+ FirstName);
        System.out.println("Last name:"+ LastName);
        System.out.println("Age:"+ age);
    }
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter First name:");
     String fn=sc.next();
        System.out.println("Enter Last name:");
     String ln=sc.next();
        System.out.println("Enter age:");
     int a=sc.nextInt();
     getInfo(fn,ln,a);
     printInfo();
    }
}
