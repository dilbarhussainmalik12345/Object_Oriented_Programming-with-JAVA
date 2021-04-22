package Practice.poly_morphism;
import static java.lang.System.out;
public class Student_p extends Person_poly  
{
    public String Cmsid,surname;
    
    
    public Student_p()
    {
        //name = null;
        Cmsid = null;
        surname = null;
    }
   
    public void Showinfo()
    {
        //out.println("Name:-\t" + "Dilbar");
        out.println("CMSID:-\t" + "023-20-0155");
        out.println("Surname:-\t" + "Malik");
    }
   
    
}
