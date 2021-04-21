package Practice.Lab_Task;
import static java.lang.System.out;
import java.util.Scanner;
public class Lab_Task 
{
    public double x;
    public double y;
    
    public double Sum(double x,double y)
    {
        return x + y;
    }
    public double Subtraction(double x ,double y)
    {
        return x-y;
    }
    public double Multiply(double x,double y)
    {
        return x*y;
    }
    public double Divide(double x,double y)
    {
        return x/y;
    }
    public int Compute_Exponent(int base,int power)
    {
        return base*base*base;   
    }
    
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        int base = scan.nextInt();
       int power = scan.nextInt();
       
        
       Lab_Task  obj = new Lab_Task();
       obj.Sum(x, y);
       obj.Subtraction(x, y);
       obj.Multiply(x, y);
       obj.Divide(x, y);
       obj.Compute_Exponent(base, power);
       
       
       out.println("Sum:-\t" + obj.Sum(x, y));
       out.println("Subtarct:-" + obj.Subtraction(x, y));
       out.println("Multiply:-" + obj.Multiply(x, y));
       out.println("Divide:-" + obj.Divide(x, y));
       out.println("Output is:-" + obj.Compute_Exponent(base, power));
       
       
       
       
       
       
    }
    
}
