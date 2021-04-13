	public class Two_D_Array
{

public int [][] array1;

public Two_D_Array(int [][] array1)
{

this.array1 = array1;

for(int i = 0;i<3;i++)
{
	for(int j= 0;j<3;j++)
	{
          System.out.println(array1[i][j]);
	}


}

}

public static void main(String [] args)
{
int [][] array1 = new int[3][3];

array1 [0][0] = 2;
array1 [0][1] = 4;
array1 [0][2] = 6; 
array1 [1][0] = 8;
array1 [1][1] = 10;
array1 [1][2] = 12;
array1 [2][0] = 14;
array1 [2][1] = 16;
array1 [2][2] = 18;

Two_D_Array sc = new Two_D_Array(array1);

}

}