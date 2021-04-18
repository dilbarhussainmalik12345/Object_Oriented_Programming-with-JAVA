package Practice;
import static java.lang.System.out;
import java.util.Scanner;
public class Two_D_input 
{
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        out.println("Enter The Number Of Arrays Values");
        
        int value = scan.nextInt();
        int input[][] = new int[value][value];
        
        out.println("Enetr The Values..");
        
        for(int i = 0; i < input.length;i++)
        {
            for(int j = 0; j < input.length;j++)
            {
                input[i][j] = scan.nextInt();
                out.println("Output is:-" + input[i][j]);
            }
        }
                
                
                
                
    }
}
