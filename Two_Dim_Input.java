import java.util.Scanner;
public class Two_Dim_Input
{



public static void main(String [] args)
{

int [][] value = new int[3][3];
Scanner obj = new Scanner(System.in);

System.out.println("Enter The Values");
for(int i = 0; i < 3;i++)
{
	for(int j = 0; j< 3; j++)
		{
		   value[i][j] = obj.nextInt();
		}



}

System.out.println("Numbers In Row Form....");
for(int i = 0; i< 3;i++)
{
	for(int j = 0; j < 3; j++)
		{
		   System.out.print(" "+ value[i][j]);
		}
   System.out.print(" ");

}





}


}