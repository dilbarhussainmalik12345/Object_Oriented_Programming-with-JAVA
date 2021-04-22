package Practice.poly_morphism;
import static java.lang.System.out;
public class Person_poly 
{
    public String name,Cnic,Occupation;
    int age;
    
    
    public Person_poly()
    {
        name = null;
        Cnic = null;
        Occupation = null;
        age = 0;
    }
    
    public void Showinfo()
    {
        out.println("Name:-\t" + "Ali");
        out.println("CNIC:-\t" + "3-43289-483");
        out.println("Occupation:-\t" + "Not Specified");
        out.println("Age:-\t" + 19);
    }
}
