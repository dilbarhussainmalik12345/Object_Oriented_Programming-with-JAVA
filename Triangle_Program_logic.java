package Practice;
import java.util.Scanner;
import static java.lang.System.out;
public class Triangle_Program_logic 
{
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b;
        
        for(a = 10; a >= 1;a--) 
            
        {                         
             b = 1;  
             while(b<=a)
             {
             out.print("#");
             b++;
             }
              out.print("\n");  
        }                   
                 
                              
            for(int f=1;f <=10;f++)        
                { 
                    int d = 1;
                    while(d<=f)
                    {
                        out.print("*");
                        d++;
                    }
                    out.print("\n");
                }
                                
    }
    
    
}
