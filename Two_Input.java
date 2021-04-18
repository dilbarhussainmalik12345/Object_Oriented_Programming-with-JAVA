package Practice;
import static java.lang.System.out;
import java.util.Scanner;
public class Two_Input 
{
   
    
  public static void main(String[] args)
  {
      Scanner obj = new Scanner(System.in);
      out.println("Enter The values of array");
      
      int a = obj.nextInt();
      int [][] array = new int[a][a];
      
      out.println("Enter The Value");
      for(int i = 0;i<array.length;i++ )
      {
          for(int j=0;j<array.length;j++)
          {
              array[i][j] = obj.nextInt();
              out.println("Output is:-" + array[i][j]);
          }
      }
      
      
  }
    
}
