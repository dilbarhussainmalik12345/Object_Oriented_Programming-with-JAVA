package Lab_Tasks_SIBA;
import static java.lang.System.out;
import java.util.Scanner;
public class Lat_TASk 
{
    public String faculty;
    public String lowrstaff;
    protected String classes;
    private String computer;
    int age;
    String labs;
    
    

    
   
    void Stringto(String faculty,String lowrstaff,String classes,String computer,String labs)
    {
        out.println("Faculty:-" +faculty);
        out.println("Lower staff:-" +lowrstaff);
        out.println("Class:-" + classes);
        out.println("No:of computer:-" +computer);
        out.println("Labs:-" + labs);
     }
    
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String faculty =scan.nextLine();
        String lowrstaff = scan.nextLine();
        String classes = scan.nextLine();
        String computer = scan.nextLine();
        String labs = scan.nextLine();
        Lat_TASk input = new Lat_TASk();
        
       input.Stringto(faculty,lowrstaff,classes,computer,labs);
        
        
        
        
    }
    
}
