package Practice.poly_morphism;
import static java.lang.System.out;
public class Uper_Staff_uni extends University_polymorphism 
{
   String director,locate;
   
   public Uper_Staff_uni()
   {
       this.director = null;
       this.locate  = null;
   }
   
   public void Show_File()
   {
       out.println("Name:-\t" + "Fareed Hussain");
       out.println("Office Location:-\t" + "Center of Cpmus");
   }
   
    
}
