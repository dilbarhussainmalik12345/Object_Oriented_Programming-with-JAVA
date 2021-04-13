import java.util.Scanner;
public class One_d_Input
{

public static void main(String [] args)
{

Scanner obj = new Scanner(System.in);

System.out.println("Enter the Number of Array");

int input = obj.nextInt();

int[] a = new int[input];

System.out.println("Enter The Values..");

for(int i = 0; i < a.length; i++)
{

a[i] = obj.nextInt();

}

}


}