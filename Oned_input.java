import java.util.Scanner;
public class Oned_input
{

public static void main(String [] args)
{
int[] array = new int[9];

Scanner scan = new Scanner(System.in);
System.out.println("Enter Values...");
for(int i = 0;i<array.length;i++)
{

 array[i] = scan.nextInt();


}


}

}