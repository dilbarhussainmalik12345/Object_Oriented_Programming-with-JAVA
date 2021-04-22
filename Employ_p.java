package Practice.poly_morphism;
import static java.lang.System.out;
public class Employ_p extends Person_poly 
{
    public String work,status,departement;
    
    
    public Employ_p()
    {
        work = null;
        status = null;
        departement = null;
    }
    
    public void Showinfo()
    {
        out.println("Work:-\t" + "As Teaching");
        out.println("Status:-\t" + "Assistant Professor");
        out.println("Depatement:-\t" + "Computer Science");
    }
    
}
