package Lab_Tasks;
import java.util.Scanner;
import static java.lang.System.out;
public class Overloading_program 
{
    public int Sum(int a , int b)
    {
        return a+b;
    }
    public int Subtarct(int a,int b, int c)
    {
        return a-(b+c);
    }
    public double Multiply(double a , double b)
    {
        return a + b;
    }
    public double Divide(double a, double b)
    {
        return a/b;
    }
    public static void main(String[] args)
    {
        Overloading_program overload = new Overloading_program();
        
        int Sum = overload.Sum(10, 20);
        out.println("Sum of Two Numbers:-\t" + Sum);
        
        int Subtract = overload.Subtarct(100, 20, 30);
        out.println("Subtraction  of three:-\t" + Subtract);
        
        double Multiply = overload.Multiply(30, 2);
        out.println("Multiplication of numbers:-\t" + Multiply);
        
        double Divide = overload.Multiply(30, 2);
        out.println("Division of two numbers:-\t" + Divide);
    }
    
    
}
