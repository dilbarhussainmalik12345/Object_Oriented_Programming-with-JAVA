package Practice;
import static java.lang.System.out;
import java.util.Scanner;
public class Do_While_Task 
{
    
    public int a;
    public int b;
    
    public int Sum(int a,int b)
    {
        return a+b;
    }
    public int Subtract(int a, int b)
    {
        return a-b;
    }
    
    public int Multiply(int a, int b)
    {
        return a*b;
    }
    
    public int Divide(int a,int b)
    {
        return a/b;
    }    
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Do_While_Task obj = new Do_While_Task();
        
        char character = 'c';
        
        do
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            char Char = scan.next().charAt(0);
            
            obj.Sum(a, b);
            obj.Subtract(a, b);
            obj.Multiply(a, b);
            obj.Divide(a, b);
            
            switch(Char)
            {
                case 'S':
                    out.println("Sum of two numbers:-\t" + obj.Sum(a, b));
                    break;
                    
                case 'T':
                    out.println("Subtact of two numbers:-\t" + obj.Subtract(a, b));
                    break;
                case 'M':
                    out.println("Multiply of two numbers:-\t" + obj.Multiply(a, b));
                    break;
                case 'D': 
                    out.println("Divide of two numbers:-\t"+ obj.Divide(a, b));
                    break;
                default :
                    out.println("The Character You Put Has No Values Here");
                        
            }
            out.println("Input Character For Continue:-\t");
            character = scan.next().charAt(0);
        }
        while(character=='c'); 
    }
    
    
}
