package Lab_Tasks;
import static java.lang.System.out;
public class Person_Employ_Admin extends Person_Employ_Faculty 
{
    public String work;
    public String management;
    
    
    public Person_Employ_Admin()
    {
        this.work = null;
        this.management = null;
        
        
        out.println("Specialization:-\t" + super.specialization);
        out.println("Course:-\t" + super.courses);
    }
    
    public static void main(String[] args)
    {
        Person_Employ_Admin obj = new Person_Employ_Admin();
    }
}
