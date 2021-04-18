package Practice;
import static java.lang.System.out;
public class Two_Dimension 
{
    int [][] dimen;
    
    public Two_Dimension(int [][] dimen)
    {
        for(int i = 0; i < dimen.length;i++)
        {
            for(int j =0;j<dimen[i].length;j++)
            {
                out.println("Output is:-\t" + dimen[i][j]);
            }
        }
    }
            
    public static void main(String[] args)
    {
        int [][] dimen = {{2,4,6,8},{10,12,14}};
       
        Two_Dimension obj = new Two_Dimension(dimen);
        
    }
    
}
