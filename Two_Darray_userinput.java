import java.util.Scanner;
import java.util.Scanner;
public class Two_Darray_userinput
{


public static void main(String [] args)
{
int [][] array = new int[2][3];

Scanner obj = new Scanner(System.in);

System.out.println("Enter The Values");
for(int i = 0;i < 2; i++)
{
	for(int j =0; j < 3; j++)
		{
		   
		  array[i][j] = obj.nextInt();
		}



}
System.out.println("Matrix Form");
for(int i = 0;i < 2; i++)
{
	for(int j =0; j < 3; j++)
		{
		   
		  System.out.print(" " + array[i][j]);
		}

        System.out.print(" ");

}

}







}