package Practice.poly_morphism;
import static java.lang.System.out;
public class Cattle_Animal_O extends Animal_O 
{
    public String name,liveplace,identity;
    public int horons;
    
    
    public Cattle_Animal_O()
    {
        this.name = null;
        this.liveplace = null;
        this.identity = null;
        this.horons = 0;
    }
    
    public void Show_Result()
    {
        out.println("Name:-\t" + "Cow");
        out.println("Live Place:-\t" + "Home");
        out.println("Identity:-\t" + "As Animal");
        out.println("Horons:-\t" + "Two");
    }
}

