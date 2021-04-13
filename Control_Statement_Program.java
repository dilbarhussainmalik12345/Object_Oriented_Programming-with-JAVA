package Practice;
import static java.lang.System.out;
public class Control_Statement_Program 
{
    public String name;
    public String Cms_id;
    public String Class;
    public int R_no;
    
    public Control_Statement_Program()
    {
        this.name = null;
        this.Class = null;
        this.Cms_id = null;
        this.R_no = 0;
    }
    
    public Control_Statement_Program(String name)
    {
        this.name = name;
        this.Class = null;
        this.Cms_id = null;
        this.R_no = 0;
    }
    
    public Control_Statement_Program(String name, String Class)
    {
        this.name = name;
        this.Class = Class;
        this.Cms_id = null;
        this.R_no = 0;
    }
    
    public Control_Statement_Program(String name,String Class,String Cms_id)
    {
        this.name = name;
        this.Class = Class;
        this.Cms_id = Cms_id;
        this.R_no = 0;
    }
    
    public Control_Statement_Program(String name,String Class,String Cms_id,int R_no)
    {
        this.name = name;
        this.Class = Class;
        this.Cms_id = Cms_id;
        this.R_no = R_no;
    }
    
    public void Showinfo()
    {
        out.println("Student Name:-\t" + name);
        out.println("Student Class:-\t" + Class);
        out.println("Student Cms_Id:-\t" + Cms_id);
        out.println("Student Roll Number:-\t" + R_no);
    }
    
    public static void main(String[] args)
    {
        Control_Statement_Program control = new Control_Statement_Program();
        Control_Statement_Program control2 = new Control_Statement_Program("Dilbar");
        Control_Statement_Program control3 = new Control_Statement_Program("Dilbar","CS-II");
        Control_Statement_Program control4 = new Control_Statement_Program("Dilbar","CS-II","023-20-0155");
        Control_Statement_Program control5 = new Control_Statement_Program("Dilbar","CS-II","023-20-0155",103);
        control.Showinfo();
        control2.Showinfo();
        control3.Showinfo();
        control4.Showinfo();
        control5.Showinfo();
        
    }
    
    
}
