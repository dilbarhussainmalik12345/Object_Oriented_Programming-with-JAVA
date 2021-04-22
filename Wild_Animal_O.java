package Practice.poly_morphism;
import static java.lang.System.out;
public class Wild_Animal_O extends Animal_O
{
    public String eat,live,behave,swiftness,status;
    
    public Wild_Animal_O()
    {
        this.eat = null;
        this.live = null;
        this.behave = null;
        this.swiftness = null;
        this.status = null;
        
    }
    
    public void Show_Result()
    {
        out.println("Eat:-\t" + "Foood");
        out.println("Live:-\t" + "Jungle");
        out.println("Behave Like:-\t" + "Wild Animals");
        out.println("Switfness:-\t" + "Too Much");
        out.println("Status:-\t" + "King of jungle");
    }
    
    
}
