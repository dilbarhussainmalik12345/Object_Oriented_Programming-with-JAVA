package Projects;
import static java.lang.System.out;
import java.util.Scanner;
public class MainClass_Final_Semester extends FinalSemester_Project  
{
     Scanner scan = new Scanner(System.in);
    
     String name, fathername, email, number, address;
     double matricmrks, intermrks,  percentage, percentage_inter;
     double   matric_totalmrks = 850;
     double intertotalmrks = 1100;
     char grade;
     int enroll;
     public String Stdent_Seatnumber;
     public int Student_grdyear;
     public int Stdent_Id = 1000;
     
     
    public void FirstPhase()
    {
       
       
        System.out.println("\t\t\tPlease Enter Your Peronal Details\n");
        
        out.print("\t\t\tPlease Enter Your Name: ");
        name = scan.nextLine();
        
        out.print("\t\t\tPlease Enter Father Name: ");
        fathername = scan.nextLine();
        
        out.print("\t\t\tPlease Enter Email: ");
        email = scan.nextLine();
        
        out.print("\t\t\tPlease Enter Your Number: ");
        number = scan.nextLine();
        
        out.print("\t\t\tPlease Enter Address:");
        address = scan.nextLine();
     
        if(address.equals(address))
        {
            out.println("\t\t\tFirst Phase has Completed\n");
            out.println("\t\t\tStep Towards Second Phase");
        }
              
        
        
       out.println();
       
    }
    
    public void SecondPhase()
    {
        out.println("\t\t\tPlease Enter Education Details\n");
        
        out.print("\t\t\tPlease Enter Your Matric Marks: ");
        matricmrks = scan.nextDouble();
        out.println();
        
         percentage = (matricmrks*100)/matric_totalmrks ;
         
        if(percentage <= 100 && percentage >= 50 )
        {
            if(percentage < 100 && percentage > 92.9)
            {
                 out.println("\t\t\tA1 Grade");
            }
            
            if(percentage < 92.9 && percentage > 85.8)
            {
                out.println("\t\t\tA Grade");
            }
            if(percentage < 85.5 && percentage > 78.8)
            {
                out.println("\t\t\tB Grade");
            }
            if(percentage < 78.8 && percentage > 71.7)
            {
                out.println("\t\t\tC Grade");
            }
           if(percentage < 71.7 && percentage > 64.7)
            {
                out.println("\t\t\tD Grade");
            }
           if(percentage < 64.7 && percentage > 57.6)
           {
               out.println("\t\t\tE Grade");
           }
           if(percentage < 57.6 && percentage > 50)
           {
               out.println("\t\t\tF Grade");
           }
           
           
        }
             else 
            {
                out.println("\t\t\tYou are not elligible");
               
            }
        out.println();
        
        out.print("\t\t\tPlease Enter Your Inter Marks: ");
        
        intermrks = scan.nextDouble();
        out.println();
        
        percentage_inter = (intermrks*100)/intertotalmrks;
        
        if(percentage_inter <= 100 && percentage_inter >= 50)
        {
            if(percentage_inter < 100 && percentage_inter > 92.9)
            {
                 out.println("\t\t\tA1 Grade");
            }
            
            if(percentage_inter < 92.9 && percentage_inter > 85.8)
            {
                out.println("\t\t\tA Grade");
            }
            if(percentage_inter < 85.5 && percentage_inter > 78.8)
            {
                out.println("\t\t\tB Grade");
            }
            if(percentage_inter < 78.8 && percentage_inter > 71.7)
            {
                out.println("\t\t\tC Grade");
            }
           if(percentage_inter < 71.7 && percentage_inter > 64.7)
            {
                out.println("\t\t\tD Grade");
            }
           if(percentage_inter < 64.7 && percentage_inter > 57.6)
           {
               out.println("\t\t\tE Grade");
           }
           if(percentage_inter < 57.6 && percentage_inter > 50)
           {
               out.println("\t\t\tF Grade");
           }
           
           
            
        }
          else 
            {
                out.println("\t\t\tYou are not elligible");
                 System.exit(0);
            }
        if(intermrks == (intermrks))
        {
            out.println("\t\t\tSecond Phase has Completed\n");
            out.println("\t\t\tStep Towards Third Phase");
        }
       
    }
    
    public void ThirdPhase()
    {
        out.println("\t\t\tPlease Choose Any One Departement From The Following Which You Want");
        out.println("\t\t\t--> BS Computer Science"
        + "\t\t\t\t Press 1 For Enroll");
        out.println("\t\t\t--> BS Software Engineering"
        + "\t\t\t Press 2 For Enroll");
        out.println("\t\t\t--> B Bussiness Admintration" 
        + "\t\t\t Press 3 For Enroll");
        out.println("\t\t\t--> B Elctrical Engineering" 
        + "\t\t\t Press 4 For Enroll");
        out.println("\t\t\t--> B Education Departement"
        + "\t\t\t Press 5 For Enroll");
        out.println("\t\t\t--> (CA)Chartered Accountant"
        + "\t\t\t Press 6 For Enroll");
        out.print("\t\t\tIf You Want To Cancel Press 7: ");
        enroll = scan.nextInt();
        if(enroll == 1)
        {
            out.println("\t\t\tEnrolled Successfully In Computer Sceience");
        }
        if(enroll == 2)
        {
            out.println("\t\t\tEnrolled Successfully In Software Engineering");
        }
        if(enroll == 3)
        {
            out.println("\t\t\tEnrolled Successfully In B Bussiness Addministration");
        }
        if(enroll == 4)
        {
            out.println("\t\t\tEnrolled Successfully In B Electrical Engineering");
        }
        if(enroll == 5)
        {
            out.println("\t\t\tEnrolled Successfully In B Education Departement");
        }
        if(enroll == 6)
        {
            out.println("\t\t\tEnrolled Successfully In Chartered Accountant");
        }
        if(enroll == 7)
        {
            System.exit(enroll);
        }
        
        
        set_StudentSeatnumber();
        out.println("\t\t\tStudent Seat Number: " + Stdent_Seatnumber);
        out.println();
        
    }
    
    public void set_StudentSeatnumber()
        {
            Stdent_Id ++;
            this.Stdent_Seatnumber =  Student_grdyear + " " + Stdent_Id;
        }
        
    
    
    
    
    
    public String toString()
    {
//        out.println("\t\t\t<-----Bio-Data----->");
//     
//        out.println("\t\t\t Name: " + name);
//        out.println("\t\t\t Father Name: " + fathername);
//        out.println("\t\t\t Email-Id: " + email);
//        out.println("\t\t\t Number: " + number);
//        out.println("\t\t\tAddress: " + address);
//        
//        out.println("\t\t\t<-----Education Details----->");
//        
//        out.println("\t\t\tMatric Marks: " + matricmrks);
//        out.println("\t\t\tInter Marks : " + intertotalmrks);
//        out.println("\t\t\tMatric Class Percentage: " + percentage + "%" );
//        out.println("\t\t\tInter Class Percentage: " + percentage_inter + "%");
         
        return "\t\t\t<-----Bio-Data----->\n" +
                "\n\t\t\tName:-----> " + name +
                "\n\t\t\tFatherName:-----> " + fathername +
                "\n\t\t\tEmail-Id:-----> " + email +
                "\n\t\t\tNumber:-----> " + number +
                "\n\t\t\tAddress:----->" + address +
                "\n" +
                "\n\t\t\t<-----Education Details----->\n" +
                "\n\t\t\tMatric Marks:-----> " + matricmrks +
                "\n\t\t\tInterMarks:-----> " + intermrks +
                "\n\t\t\tMatric Class Parcentage:-----> " + percentage + "%" + 
                "\n\t\t\tInter Class Parcentage:-----> " + percentage_inter + "%" +
                "\n\t\t\tDepartement:----->" + enroll +
                "\n\t\t\tSeat Number:----->" + Stdent_Seatnumber +
                "\n\t\t\tFinally Form Submitted Successfully";
                
        
        
       
       
    }
}
