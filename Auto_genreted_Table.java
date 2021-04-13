package Practice;
import static java.lang.System.out;
import java.util.Scanner;
public class Auto_genreted_Table 
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        int table = input.nextInt();   
        //int u = input.nextInt();
             
        for(a=1;a<=table;a++)
        {
            for(b=1;b<=10;b++)
            {
                c=a*b;
                out.println("Output is:- \t" + a +"*"+b+ "=" + c);
                //out.println(table);
                
            }
        }
        
    }
    
}
