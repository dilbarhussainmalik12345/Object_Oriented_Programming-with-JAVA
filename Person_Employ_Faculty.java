package Lab_Tasks;
import static java.lang.System.out;
public class Person_Employ_Faculty extends Person_Employ
{
    
    public String specialization;
    public String courses;
    
    public Person_Employ_Faculty()
    {
        this.specialization = "Programming";
        this.courses = "Object-Oriented Programming in JAVA";
        
        out.println("Id:-\t" + super.Id);
        out.println("Departement:-\t" + super.departement);
        out.println("Grade:-\t" + super.grade);
        out.println("Salary:-\t"+super.salary);
    }
    
    
    public static void main(String[] args)
    {
        Person_Employ_Faculty obj = new Person_Employ_Faculty();
    }
}
