import java.util.Scanner;
public class One_dim
{



public static void main(String [] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter The Number of Array");
int value = scan.nextInt();

int[] a = new int[value];
System.out.println("Enter The numbers");

for(int i = 0; i < a.length; i++ )
{

a[i] = scan.nextInt();


}




}








}