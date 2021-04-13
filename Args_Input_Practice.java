package Practice;
import java.util.Scanner;
import static java.lang.System.out;

public class Args_Input_Practice 
{
    String Inputuser(String a, String b)
    {
        return a + b;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        
        Args_Input_Practice  practice = new Args_Input_Practice();
        out.println("Answar is:-\t" + practice.Inputuser(a, b));
    }
    
}
