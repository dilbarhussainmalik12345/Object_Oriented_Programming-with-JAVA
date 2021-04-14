package Lab_Tasks;
import static java.lang.System.out;
public class Person_Employ extends Person_Student 
{
    
    public String Id;
    public String departement;
    public char grade;
    public float salary;
    
    public Person_Employ()
    {
        this.Id = "102";
        this.departement = "Computer Science";
        this.grade = ' ';
        this.salary = 105234.54f;
        
        out.println("Cms_id:-\t" + super.Cms_id);
        out.println("Departement:-\t" + super.departement);
        out.println("Batch:-\t"+ super.batch);
        out.println("E-Mail Account:-\t" +super.mail);
        out.println("CGPA:-\t" + super.gpa);
    }
    
    public static void main(String[] args)
    {
        Person_Employ obj = new Person_Employ();
    }
    
}
