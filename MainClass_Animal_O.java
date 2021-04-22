package Practice.poly_morphism;
import static java.lang.System.out;
public class MainClass_Animal_O 
{
    
    public static void main(String[] args)
    {
        Animal_O obj = new Animal_O();
        Animal_O catle = new Cattle_Animal_O();
        Animal_O wild = new Wild_Animal_O();
        
       
        
       obj.Show_Result();
        out.println("\n\n");
        catle.Show_Result();
        out.println("\n\n");
        wild.Show_Result();   
        
        
    }
}
