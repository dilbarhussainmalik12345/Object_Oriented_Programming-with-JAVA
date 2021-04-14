package Lab_Tasks;
import java.util.Scanner;
import static java.lang.System.out;
public class Nested_classes 
{
    public String Class;
    private int stu;
    Students st;
    
    public Nested_classes(String Class)
    {
        this.Class = Class;
        this.stu = 110;
        st = new Students();
        
    }
    
    public int getter_stu()
    {
        return this.stu;
    }
    
    public void setter_stu(int stu)
    {
        this.stu = stu;
    }
    
    public void ShowInfo_Outer()
    {
        out.println("Class Name is:-\t" + Class);
        out.println("Cms Id's:-\t" + stu);
        out.println("Students Name:-\t" + st.name);
        out.println("Students id:-\t" + st.id);
        
    }
    
    public class Students
    {
        public String name = "Ali";
        public String id;
        
        public void ShowInfo_Inner()
        {
            out.println("Class Name:-\t" + Class);
            out.println("Cms-Id:-\t" + stu);
            out.println("Student Name:-\t"+ name);
            out.println("Student Id:-\t" + id);
        }
    }
    
    
    public static void main(String[] args)
    {
        
        Nested_classes user = new Nested_classes("BS/CS/SE-II");
        Nested_classes.Students st = user.new Students();
        
        out.println("Numbers Of Students:-\t" + user.getter_stu());
        user.setter_stu(10);
        out.println(user.getter_stu());
        user.ShowInfo_Outer();
        st.ShowInfo_Inner();
        
    }
}
