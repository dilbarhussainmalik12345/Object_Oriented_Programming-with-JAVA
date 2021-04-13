import java.util.Scanner;
public class onedimension_userinput
{


public static void main(String [] args)
{

Scanner scan = new Scanner(System.in);
System.out.println("Enter The number of Array");

int value = scan.nextInt();

int[] a = new int[value];
System.out.println("Enter The numbers");

for(int i =0; i < a.length; i++)
{

a[i] = scan.nextInt();




}



}







}