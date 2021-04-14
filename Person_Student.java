package Lab_Tasks;
import static java.lang.System.out;
public class Person_Student extends Person_Inheritance
{
    
    public String Cms_id;
    public String departement;
    public String batch;
    public String mail;
    public float gpa;
    
    public Person_Student()
    {
        this.Cms_id = "023_20_0155";
        this.departement = "Computer Science";
        this.batch =  "Third";
        this.mail = "dilbar.bskdkf20@iba-suk.edu.pk";
        this.gpa = 3.4f;
        
        out.println("Name:-\t"+super.name);
        out.println("Caste:-\t" + super.caste);
        out.println("Gender:-\t" + super.gender);
        out.println("Address:-\t" + super.address);
        
    }
    
    public static void main(String[] args)
    {
        Person_Student obj = new Person_Student();
        
        
    }
    
}
