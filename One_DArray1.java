public class One_DArray1
{

public int [] array;




public One_DArray1(int [] array)
{

this.array = array;
//System.out.println(array[0]+""+array[1]);
for(int i = 0; i<array.length; i++ )
{

System.out.println(array[i]);

}

}

public static void main(String [] args)
{

//int [] array = {1,2,3,4}; 

int [] array = new int[5];

array [0] = 500;
array [1] = 1000;
array [2] = 1500;
array [3] = 2000;
array [4] = 2500;
//array [5] = 3000;

One_DArray1 obj = new One_DArray1(array);


}

}