package Projects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import static java.lang.System.out;
import java.util.Scanner;
import javafx.scene.control.Button;
import javax.swing.JButton;
import javax.swing.JFrame;
public class FinalSemester_Project 
{
    
    public static void main(String[] args)
    {
        out.println("\t\t\tWelcome To Sukkur IBA University\n\n"
               + "\t\t\tOnline Registration Form For Spring 2021\n\n");
        FinalSemester_Project obj = new FinalSemester_Project();
       
        
        try
        {
            FileWriter myWriter = new FileWriter("C:\\Users\\Agha\\Documents\\NetBeansProjects\\Lab_Tasks\\src\\Projects\\FinalSemester_Project.txt");
            myWriter.write("\t\t\tFinal Semester Project\n");
            
             MainClass_Final_Semester obj1 = new MainClass_Final_Semester();
             obj1.FirstPhase();
             obj1.SecondPhase();
             obj1.ThirdPhase();
            
             
             String fc;
             fc = obj1.toString();
             myWriter.write(fc);
             myWriter.close();
             
             try
             {
                File myObj = new File("C:\\Users\\Agha\\Documents\\NetBeansProjects\\Lab_Tasks\\src\\Projects\\FinalSemester_Project.txt");
                Scanner myReader = new Scanner(myObj);
                while(myReader.hasNextLine())
                        {
                            String data = myReader.nextLine();
                            out.println(data);
                        }
                myReader.close();
             }
             catch(FileNotFoundException e)
             {
                 out.println("Error Occured");
                 e.printStackTrace();
             }
             
             out.println("\t\t\tSuccessFully We Have Submitted Our Form");
        }
        catch(Exception e)
        {
            out.println("An Error Occured");
            e.printStackTrace();
        
        
            
        }
        
        
        
        
        
       
        
       
        
   /*     JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Me");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        */
    }
    
}
