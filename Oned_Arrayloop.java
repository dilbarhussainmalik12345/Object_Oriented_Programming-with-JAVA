public class Oned_Arrayloop
{

public int [] array;

public Oned_Arrayloop(int [] array)
{
this.array = array;
for(int i = 0;i<array.length; i++)
{

System.out.println(array[i]);

}



}

public static void main(String [] args)
{

int [] array= {1,2,3,4,5};

array [0] = 100;
array [1] = 200;
array [2] = 300;
array [3] = 400;
array [4] = 500;


Oned_Arrayloop sc = new Oned_Arrayloop(array);

}


}