package Practice;
import static java.lang.System.out;
public class Student_Class 
{
    boolean name;
    int age;
    
    void ClassMate()
    {
        name = true;
        age = 10;
    }
    void Uni_Mate()
    {
        name = false;
        age = 20;
    }
    void MakeStudent(int newage)
    {
        age = newage;
    }
    void PrintState()
    {
        out.println("Current State:-");
        out.println("Name:-" + name);
        out.println("Age:-" + age);
        
    }
    
    public static void main(String[] args)
    {
        Student_Class obj1 , obj2;
        obj1 = new Student_Class();
        obj2 = new Student_Class();
        
        obj1.ClassMate();
        obj2.ClassMate();
        
        obj1.Uni_Mate();
        obj2.Uni_Mate();
        
        obj1.MakeStudent(30);
        
        obj1.PrintState();
        obj1.PrintState();
    }    
    
    
}
