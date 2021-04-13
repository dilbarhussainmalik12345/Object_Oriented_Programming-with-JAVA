package Practice;
import static java.lang.System.out;
public class Animal_Class_Practice 
{
    public String name;
    public String Class;
    public int age;
    public int semester;
    
    public Animal_Class_Practice(String name,String Class,int age,int semester)
    {
        this.name = name;
        this.Class = Class;
        this.age = age;
        this.semester = semester;
        
    }
    public void ShowFile()
    {
        out.println("Student Name:-\t" + name);
        out.println("Student Class:-\t" + Class);
        out.println("Student Age:-\t" + age);
        out.println("Student Semester:-\t" + semester);
    }
    public static void main(String[] args)
    {
        Animal_Class_Practice output = new Animal_Class_Practice("Dilbar" , "CS-II" , 19 , 4);
        output.ShowFile();
        
    }
}
