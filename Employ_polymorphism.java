package Practice.poly_morphism;
import static java.lang.System.out;
public class Employ_polymorphism extends Poly_Morphism 
{
    public String employeeId,departement;
    public double salary;
    
    public Employ_polymorphism()
    {
        employeeId = null;
        departement = null;
        salary = 0.0;
        
    }
    
    public void Show_info()
    {
        out.println("Emploee Id:-" + "104");
        out.println("Deparetement:-" + "CS");
        out.println("Salary:-" + 17283737 );
    }
}
