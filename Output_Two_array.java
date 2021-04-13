public class Output_Two_array
{

public int[][] array;


public Output_Two_array(int [][] array)
{
this.array = array;
for(int i = 0; i < 2;i++)
{
	for(int j = 0; j<3;j++)

		{

		 System.out.println(array[i][j]);

		}

}



}

public static void main(String [] args)

{

int[][] array = {{1,2,3},{4,5,6}};

//array [0][0] = 10;
//array [0][1] = 2;
//array [0][2] = 4;
//array [1][0] = 4;
//array [1][1] = 3;
// array [1][2] = 2;

Output_Two_array obj = new Output_Two_array(array);








}








}