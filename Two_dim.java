public class Two_dim
{

public int [][] num;



public Two_dim(int [][] num)
{
this.num = num;
for(int i =0; i < 4;i++)
{
	for(int j = 0; j < 4; j++)
		{
		   System.out.println("The Output is Given Below:-\n" + num[i][j]);
		}

}

}

public static void main(String [] args)
{
int [][] num = new int[4][4];

num [0][0] = 2;
num [0][1] = 4;
num [0][2] = 6;
num [0][3] = 8;
num [1][0] = 10;
num [1][1] = 12;
num [1][2] = 14;
num [1][3] = 16;
num [2][0] = 18;
num [2][1] = 20;
num [2][2] = 22;
num [2][3] = 24;
num [3][0] = 26;
num [3][1] = 28;
num [3][2] = 30;
num [3][3] = 32;

Two_dim scan = new Two_dim(num);




}


}