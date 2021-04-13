package Practice;
import java.util.Scanner;
import static java.lang.System.out;

public class Calculator_Program 
{
    int a;
    int b;
    
    public int Sum(int a,int b)
    {
        return a+b;
    }
    public int Subtarct(int a,int b)
    {
        return a-b;
    }
    public int Multiply(int a,int b)
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
        out.println("Please Enter First Number:-\t");
        int a = scan.nextInt();
        out.println("Please Enter Second Number:-\t");
        int b = scan.nextInt();
        
        out.println("Enter Number 1 for Addition");
        out.println("Enter Number 2 for Subtraction");
        out.println("Enter Number 3 for Multiplication");
        out.println("Enter Number 4 for Division");
        
        int num = scan.nextInt();
        
        Calculator_Program obj = new Calculator_Program();
        obj.Sum(a, b);
        obj.Subtarct(a, b);
        obj.Multiply(a, b);
        obj.Divide(a, b);
        
        if(num == 1)
        {
            out.println("Adition is:-\t" + obj.Sum(a, b));
        }
        if(num == 2) 
        {
            out.println("Subtraction is:-\t" + obj.Subtarct(a, b));
        }
        if(num == 3)
        {
            out.println("Multiplication is:-\t" + obj.Multiply(a, b));
        }
        if(num == 4)
        {
            out.println("Division is:-\t" + obj.Divide(a, b));
        }
        else
        {
            out.println("Desired Value is not here..........????");
        }
    }
}
