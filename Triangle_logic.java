package Practice;
import java.util.Scanner;
import static java.lang.System.out;

public class Triangle_logic 
{
    
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b;
        
        for(a = 1; a<=20;a++)
        {
            b = 1;
            while(b<=a)
            {
                out.print("*");
                b++;
            
            }
            out.print("\n");
        
        }
        
    
    }
    
    
}
