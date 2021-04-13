package Practice;
import java.util.Scanner;
import static java.lang.System.out;
public class Animal_Class_Input_Practice 
{
   
    void Input_user(String name,String Class,int age,int semester)
    {
        out.println("Student Name:-\t" + name);
        out.println("Student Class:-\t" + Class);
        out.println("Student Age:-\t" + age);
        out.println("Student Semester:-\t" + semester);
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        String Class = obj.nextLine();
        int age = obj.nextInt();
        int semester = obj.nextInt();
        
        Animal_Class_Input_Practice input = new Animal_Class_Input_Practice();
        input.Input_user(name, Class, age, semester);
        
    }
    
    
}
