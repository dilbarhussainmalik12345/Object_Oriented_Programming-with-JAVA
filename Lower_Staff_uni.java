package Practice.poly_morphism;
import static java.lang.System.out;
public class Lower_Staff_uni extends University_polymorphism 
{
    public String Peon,Sweeper,electrician;
    
    public Lower_Staff_uni()
    {
        this.Peon = null;
        this.Sweeper  =null;
        this.electrician = null;
    }
    
    public void Show_File()
    {
        out.println("Peon:-\t" + "some body");
        out.println("Sweeper:-\t" + "Some body Else");
        out.println("Electrician:-\t" + "some body in campus");
    }
    
}
