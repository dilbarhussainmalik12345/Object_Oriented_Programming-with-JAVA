package Practice;
import java.util.Scanner;
import static java.lang.System.out;
public class Rombous_Program 
{
    
    
    
    public static void main(String[] args)
    {
        int a = 15;
        int b,c,d;
        
        for(b=1; b<=a;b++)
        {
            for(c= a-b; c>=1; c--)
            {
                out.print("@");
            }
            for(d = 1; d<=2*b-1;d++)
            {
                out.print(" ");
            }
            for(c = a-b;c>=1;c--)
            {
                out.print("$");
            }
            out.print("\n");
        }
        
        for(b= a-1;b >=1; b--)
        {
            for(c=1;c<=a-b;c++)
            {
                out.print("$");
            }
            for(d =1 ;d<=2*b-1;d++)
            {
                out.print(" ");
            }
            for(c=a-b;c>=1;c--)
            {
                out.print("@");
            }
            out.print("\n");
        }
        
    }
    
}
