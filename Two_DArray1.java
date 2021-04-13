public class Two_DArray1
{

public int [][] array;




public Two_DArray1(int [][] array)
{

this.array = array;
//System.out.println(array[0]+""+ array[1]);
//for(int i = 0; i<array.length; i++ )
//{

//System.out.println(array[i]);

//}

for(int i = 0; i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.println(array[i][j]);

		}

	}

}

public static void main(String [] args)
{

//int [] array = {1,2,3,4}; 

int [][] array = new int[2][2];

array [0][0] = 500;
array [0][1] = 1000;
array [1][0] = 1500;
array [1][1] = 2000;
//array [4] = 2500;
//array [5] = 3000;

Two_DArray1 obj = new Two_DArray1(array);


	}

}