 package Practice.poly_morphism;
import static java.lang.System.out;
public class Student_polymorphism extends Poly_Morphism 
{
    public String cmsid,departement;
    public double gpa;
    
    
    public Student_polymorphism()
    {
        cmsid = null;
        departement = null;
        gpa = 0.0;
    }
    
    @Override
    public void Show_info()
    {
        super.Show_info();
        out.println("CMSid" + " 23894432");
       
        out.println("Departement:-" + "Computer Science");
        out.println("Gpa:-" + "3.4");
        
    }
    
    
    
}
