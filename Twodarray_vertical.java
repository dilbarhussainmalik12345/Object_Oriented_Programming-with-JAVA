public class Twodarray_vertical
{


public int a[][];

public Twodarray_vertical(int a[][])
{

this.a = a;
for(int i = 0;i<2;i++)
{

System.out.println("  \t");
	for(int j= 0; j< 3; j++)
		{

		  System.out.print("\t " + a[i][j]);


		}

}


}


public static void main(String [] args)
{

int a[][] = {{1,2,3},{4,5,6}};
 

Twodarray_vertical scan = new Twodarray_vertical(a);


}



}