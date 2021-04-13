public class TdArray
{


public int [][] array;

public TdArray(int [][] array)
{

this.array = array;

for(int i = 0; i<2;i++)
{
		

                  for(int j= 0;j<2;j++)
			{

			System.out.println(array[i][j]);

			}
}

}

public static void main(String [] args)
{
int [][] array = new int [2][2];

array [0][0] = 500;
array [0][1] = 1000;
array [1][0] = 1500;
array [1][1] = 2000;

TdArray obj = new TdArray(array); 


}

}