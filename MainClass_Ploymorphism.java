package Practice.poly_morphism;
import static java.lang.System.out;
public class MainClass_Ploymorphism 
{
    
    public static void main(String[] args)
    {
        
        Poly_Morphism p = new Poly_Morphism();
        //Student_polymorphism student = new Student_polymorphism();
       // Employ_polymorphism employee = new Employ_polymorphism();
        Poly_Morphism obj = new Student_polymorphism();
        
        //student.Show_info();
        //p.Show_info();
        //employee.Show_info();
        
        
        p.name = "Dilbar";
        p.Surname = "Malik";
        p.Cnic = "43103-9024655-5";
        p.age = 17;
        p.Show_info();
        obj.Show_info();
        obj.Show_info2();
        
        
        out.println("Output is:-\n\n\n\n\n\n");
      // student.cmsid= "023-20-0155";
      // student.departement = "Computer Science";
       //student.gpa = 3.4;
       // student.Surname = "Malik";
       //// student.name = "Dilbar";
      //  student.Show_info2(); 
       // out.println("\n\n\n\n\n\n");
       // student.Show_info();
        
       
    }
    
}
