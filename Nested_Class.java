package Lab_Tasks;
import static java.lang.System.out;
import java.util.Scanner;
public class Nested_Class 
{
    public String name;
    public String Cms_id;
    public String university;
    public int semester;
    Student st;
    
    public Nested_Class(String name,String Cms_id,String university,int semester)
    {
        this.name = name;
        this.Cms_id = Cms_id;
        this.university = university;
        this.semester = semester;
        st = new Student();
    }
    
    public String getter_Cms_id()
    {
        return this.Cms_id;
    }
    public void setter_Cms_id(String Cms_id)
    {
        this.Cms_id = Cms_id;
        
    }
    
    public void ShowInfo_outerClass()
    {
        out.println("Name:-\t" + name);
        out.println("Cms-Id:-" + Cms_id);
        out.println("University Name:-\t" + university);
        out.println("Semester Number:-\t"+ semester);
        out.println("Student age:-\t" + st.age);
        out.println("Student Gr Number:-\t" + st.gr_number);
    }
    public class Student
    {
        public int age = 19;
        public int gr_number = 102;
        
        public void ShowInfo_inner()
        {
            out.println("Name:-\t" + name);
            out.println("Cms-Id:-" + Cms_id);
            out.println("University Name:-\t" + university);
            out.println("Semester Number:-\t"+ semester);
            out.println("Age of Student:-\t" + age);
            out.println("Gr Number Student:-\t" + gr_number);
        }
    }
    public static void main(String[] args)
        {
            //Scanner scan = new Scanner(System.in);
            Nested_Class nested = new Nested_Class("Dilbar","023-20-0155","Sukkur Iba",'2');
            Nested_Class.Student st = nested.new Student();
         /*    
            String name = scan.nextLine();
            String Cms_id = scan.nextLine();
            String university = scan.nextLine();
            int semester = scan.nextInt();
            int age = scan.nextInt();
            int gr_number = scan.nextInt();
            */
            out.println("Cms_id:-\t" + nested.getter_Cms_id());
            nested.setter_Cms_id("023-20-156");
            
            out.println("Setter value is here:-\t" + nested.getter_Cms_id());
            nested.ShowInfo_outerClass();
            st.ShowInfo_inner();
          
        }
}
