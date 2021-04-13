package Practice;
import static java.lang.System.out;
import java.util.Scanner;
public class Control_Statement_Input 
{
    public String name;
    public String caste;
    public int age;
    
    public Control_Statement_Input()
    {
        this.name = null;
        this.caste = null;
        this.age = 0;
    }
    
    public Control_Statement_Input(String name)
    {
        this.name = name;
        this.caste = null;
        this.age = 0;
    }
    
    public Control_Statement_Input(String name,String caste)
    {
        this.name = name;
        this.caste = caste;
        this.age = 0;
    }
    
    public Control_Statement_Input(String name, String caste,int age)
    {
        this.name = name;
        this.caste = caste;
        this.age = age;
    }
    
    public void Showfile()
    {
        out.println("Name:-\t" + name);
        out.println("Caste:-\t" + caste);
        out.println("Age:-\t" + age);
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        out.println("Please Enter First String....");
        String name = input.nextLine();
        
        out.println("Please Enter Second String....");
        String caste = input.nextLine();
        
        out.println("Please Enter Third Integer....");
        int age = input.nextInt();
        
        Control_Statement_Input obj = new Control_Statement_Input();
        Control_Statement_Input obj1 = new Control_Statement_Input(name);
        Control_Statement_Input obj2 = new Control_Statement_Input(name,caste);
        Control_Statement_Input obj3 = new Control_Statement_Input(name,caste,age);
        
        obj.Showfile();
        obj1.Showfile();
        obj2.Showfile();
        obj3.Showfile();
    }
}
 