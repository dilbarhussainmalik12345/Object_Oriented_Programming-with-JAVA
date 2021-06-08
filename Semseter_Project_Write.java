package Projects;
import java.io.FileWriter;
import static java.lang.System.out;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
        
public class Semseter_Project_Write 
{
    public static void main(String[] args)
    {
        int num;
        
    Scanner scan = new Scanner(System.in);
    out.println("\t\t\t<-------Wlcome to School Management System------->");
    out.println("\t\t\t---------------------------------------------------");
    out.print("\t\t\t Please Enter any one option for desired result: "
            + "\n \t\t\t1 For Male-Faculty: "
            + "\n \t\t\t2 For Female-Faculty: "
            + "\n \t\t\tand \n\t\t\t3 For For Lower Staff: "
            + "\n \t\t\tThe Desired option:----> "); num = scan.nextInt();
                
        try
            {
                FileWriter myWriter = new FileWriter( "C:\\Users\\Agha\\Documents\\NetBeansProjects\\Lab_Tasks\\src\\Projects\\Semester_Project_Write.txt" );
                myWriter.write("\t\t\tSecond Semester Mini_Project\n");
               
//                //Main2 main2 = new Main2();
//               Male_Faculty2 faculty = new Male_Faculty2();
//                
//              faculty.tech();
//                faculty.payTuitor(); /// For Single program
//                String  fc;
//                fc = faculty.toString();
//               
//                myWriter.write(fc);
//                myWriter.close();
 if(num < 4 || num < 1)
       {
                    if(num == 1)
                    {
                        Male_Faculty2 faculty = new Male_Faculty2();
                
                      faculty.tech();
                     faculty.payTuitor();
                     String  fc;
                     fc = faculty.toString();
                     myWriter.write(fc);
                     myWriter.close();
               
                    }
                    if(num == 2)
                    {
                      Female_Faculty2 Faculty = new Female_Faculty2();
                      Faculty.tech();
                      Faculty.payTuitor();
                      String fc;
                      fc = Faculty.toString();
                      myWriter.write(fc);
                     myWriter.close();
                    }
                    if(num == 3)
                    {
                        Lower_Staff2 l_staff = new Lower_Staff2();
                        l_staff.Works();
                        l_staff.payWork();
                        String fc;
                        fc = l_staff.toString();
                        myWriter.write(fc);
                        myWriter.close();
                    }
                    if(num == 4)
                    {
                        System.exit(num);
                    }
                }
   
                 try {
                   File myObj = new File("C:\\Users\\Agha\\Documents\\NetBeansProjects\\Lab_Tasks\\src\\Projects\\Semester_Project_Write.txt");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) 
                    {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                myReader.close();
                } 
                catch (FileNotFoundException e) 
                {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                }
                
               
                
                
                out.println("\t\t\t<-------Successfully we have written program------->");
                
                
            }
            catch(Exception e)
            {
                out.println("An Error Occured");
                e.printStackTrace();
            }
            
        
           
    
        }
    
        
        }
         
    
    





