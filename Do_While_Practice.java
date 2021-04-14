
package Practice;
import static java.lang.System.out;
import java.util.Scanner;

public class Do_While_Practice 
{
    
    public int x;
    public int y;
    
    public int Sum(int x,int y)
    {
        return x+y;
    }
    
    public int Subtract(int x, int y)
    {
        return x-y;
    }
    
    public int Multiply(int x, int y)
    {
        return x*y;
    }
    
    public int Divide(int x,int y)
    {
        return x/y;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Do_While_Practice practice = new Do_While_Practice();
        
        char Character = 'C';
        
        do
        {
            out.println("Please Enter First integer..??");
            int x = scan.nextInt();
            out.println("Please Enetr Second Interger..??");
            int y = scan.nextInt();
            out.println("Please Enetr Any One Character For Desired Result..??");
            out.println("S For Sum.....");
            out.println("T For Subtract.....");
            out.println("M For Multiply.....");
            out.println("D For Division.....");
            char num = scan.next().charAt(0);
            practice.Sum(x, y);
            practice.Subtract(x, y);
            practice.Multiply(x, y);
            practice.Divide(x, y);
            
            switch(num)
            {
                case 'S':
                    out.println("Addition of two numbers:-\t" + practice.Sum(x, y));
                    break;
                case 'T':
                    out.println("Subtraction of two numbers:-\t" + practice.Subtract(x, y));
                    break;
                case 'M':
                    out.println("Multiplication of two numbers:-\t" + practice.Multiply(x, y));
                    break;
                case 'D':
                    out.println("Division of two numbers:-\t" + practice.Divide(x, y));
                    break;
                default :
                    out.println("The Character You Have Input Has No Values Here..??/ ");
            }
            out.println("Enter C for Continue Your Project Work...??"); 
            Character = scan.next().charAt(0);
                 
        }
        while(Character == 'C');
        
    }
}
