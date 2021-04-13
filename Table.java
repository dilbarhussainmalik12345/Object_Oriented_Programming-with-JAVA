package Practice;
import static java.lang.System.out;
import java.util.Scanner;
public class Table 
{
    
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int multiplier;
      //  int num = number*multiplier;
        out.println("Inter The Number For Desired Result:- \t" + number);
        
        for(multiplier = 1; multiplier <=10;multiplier++)
        {
            out.println("Output is:- \t" + multiplier*number);
        
        } 
        
    }
            
}
