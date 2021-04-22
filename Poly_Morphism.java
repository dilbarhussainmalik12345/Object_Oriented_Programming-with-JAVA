package Practice.poly_morphism;
import static java.lang.System.out;
public class Poly_Morphism 
{
    // Person Clsss
    public String name,Surname,Cnic;
    public int age;
    
    public Poly_Morphism()
    {
        name = null;
        Surname = null;
        Cnic = null;
        age = 0;
    }
    
    public void Show_info()
    {
        out.println("Name:-" + "DIlbar");
        out.println("Surname:-" + "Malik");
        out.println("Cnic:-" + "324054568054");
        out.println("Age:-" + 19);
    }
    
     public void Show_info2()
    {
        out.println("This is show info two Name:-" + name);
        out.println("Surname:-" + Surname);
        out.println("Cnic:-" + Cnic);
        out.println("Age:-" + age);
    }

    public static void main(String[] args) 
    {
        
    }
    
}
