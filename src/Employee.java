import java.util.Scanner;

public class Employee {
    String firstname,lastname,designation;
    int age;
    Employee ()
    {
        this.firstname="Yasmine";
                this.lastname="Yasamina";
                this.age=23;
                this.designation="Software Engineer";
    }
    Employee(String fn,String ln,int a,String des)
    {
        this.firstname=fn;
        this.lastname=ln;
        this.age=a;
        this.designation=des;
    }
    public void display()
    {
        System.out.println("Firstname: "+this.firstname);
        System.out.println("Lastname: "+this.lastname);
        System.out.println("Age: "+this.age);
        System.out.println("Designation: "+this.designation);
        System.out.println();
    }
 //OVERRIDING THE TOSTRING CLASS
    public String toString()
    {
        return this.firstname+" "+this.lastname+" of age "+this.age+" has a designation of "+this.designation;
    }

    public void setFirstname(String fn)
    {
        this.firstname=fn;
    }
    public void setLastname(String ln)
    {
        this.lastname=ln;
    }
    public void setAge(int a)
    {
        this.age=a;
    }
    public void setDesignation(String des)
    {
        this.designation=des;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();
        Employee emp1=new Employee("Rajesh","Koothrapali",30,"Astro Physicist");
        emp.display();
        emp.setFirstname("Sheldon");
        emp.setLastname("Cooper");
        emp.setAge(35);
        emp.setDesignation("Theoretical Physicist");
        emp.display();
        emp1.display();
        System.out.println(emp.toString());

    }
}
