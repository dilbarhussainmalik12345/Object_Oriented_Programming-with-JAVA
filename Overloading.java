package Lab_Tasks;
import static java.lang.System.out;
public class Overloading 
{
    
   public int Sum(int a,int b)
   {
       return a+b;
   }
    
   public int Sum(int a ,int b, int c)
   {
       return a+b+c;
   
   }
   public double Sum(double a,double b)
   {
       return a*b;
   }
   
       
    
    public static void main(String[] args)
    {
        Overloading math = new Overloading();
       int Sum_of_two = math.Sum(5, 7);
        out.println("Sum of Two:-\t" + Sum_of_two);
        int Sum_of_three = math.Sum(7,8,10);
        out.println("Sum of Three:-\t" + Sum_of_three);
        
        double double_Sum = math.Sum(2.0,3.0);
        out.println("Double Sum is:-\t " + double_Sum);
    }
    
}
