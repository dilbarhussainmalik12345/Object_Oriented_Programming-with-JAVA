package Practice;
import static java.lang.System.out;
import java.util.Scanner;
public class Marks_Sheet 
{
    
    public static void main(String[] args)
    {
        int s1,s2,s3,r_number,Ob_m,Total_All,Ob_All;
        float Percentage = 0;
        String grade;
        int Tm = 100;
        String name;
        
        
        Scanner scan = new Scanner(System.in);
        out.println("\t\t Marks Sheet");
        out.println("..........................................................");
        out.print("Student Name:-\t");  name = scan.nextLine();
       
        out.println("Enter The Roll Number Of the Student:-\t");
        r_number = scan.nextInt();
        out.println("..........................................................");
        
        out.print("Enetr The S1 Marks:-\t");
        s1 = scan.nextInt();
       
        out.print("Enter The S2 Marks:-\t");
        s2 = scan.nextInt();
        out.print("Enter the S3 Marks:-\t");
        s3 = scan.nextInt();
        out.println("..........................................................");
        out.println("Subject"+"\t\t Total Marks in"+"\t\tObtained Marks");
        out.println("..........................................................");
        out.println("S1"+"\t\t"+Tm+"\t\t\t"+s1);
        out.println("S2"+"\t\t"+Tm+"\t\t\t"+s2);
        out.println("S3"+"\t\t"+Tm+"\t\t\t"+s3);
        out.println("..........................................................");
        Total_All = Tm+Tm+Tm;
        Ob_All = s1+s2+s3;
        out.println("Total Marks\t"+Total_All+"\tT_Obt: Marks\t"+Ob_All);
        out.println("..........................................................");
        Percentage = (Ob_All*100)/Total_All;
        out.println("Percentage is:-"+Percentage+"%");
       
       if(Percentage > 95 && Percentage <= 100)
       {
           grade = "A+";
           out.println("Grade:-\t" + grade);
       }
       if(Percentage > 80 && Percentage <= 95)
       {
           grade = "B";
           out.println("Grade:-\t" + grade);
       }
       if(Percentage > 70 && Percentage <= 80)
       {
           grade = "C";
           out.println("Grade:-\t" + grade);
       }
       if(Percentage > 50 && Percentage <= 70)
       {
           grade = "D";
           out.println("Grade:-" + grade);
       }
       if(Percentage > 40 && Percentage <=50)
       {
           grade = "E";
           out.println("Grade:-\t" + grade);
       }
      if(Percentage  < 40)
       {
           grade = "Fail";
           out.println("Grade:-\t" + grade);
       }
      
      
       
    }
    
}
