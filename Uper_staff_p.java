package Practice.poly_morphism;
import static java.lang.System.out;
public class Uper_staff_p extends Employ_p 
{
    
    public String subject;
    public int salary;
    
    
    public Uper_staff_p()
    {
       // name = null;
        subject = null;
        salary = 0;
    }
    
    public void Showinfo()
    {
        //out.println("Professor Name:-\t" + "Sir Muzamil Shah" );
        out.println("Subject:-\t" + "JAVA");
        out.println("salary:-\t" + 80000);
    }
    
}
