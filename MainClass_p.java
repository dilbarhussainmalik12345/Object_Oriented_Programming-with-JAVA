package Practice.poly_morphism;
import static java.lang.System.out;
public class MainClass_p 
{
    public static void main(String[] args)
    {
       Person_poly obj = new Person_poly();
       Person_poly student = new Student_p();
       Person_poly employee = new Employ_p();
       Person_poly uperstaf = new Uper_staff_p();
       Employ_p uperstafff = new Uper_staff_p();
       
       
       obj.Showinfo();
       out.println("\n\n");
       student.Showinfo();
       out.println("\n\n\n");
       employee.Showinfo();
       out.println("\n\n\n");
       uperstaf.Showinfo();
       uperstafff.Showinfo();
       
        
    }
    
}
