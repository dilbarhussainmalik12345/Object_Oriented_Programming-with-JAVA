package Practice;
import static java.lang.System.out;
import java.util.Scanner;


public class University {

    
    public String uniName;
    private int nEmp;
    Students st;
    
    
    public University(String uniName){
    
        this.uniName = uniName;
        this.nEmp = 0;
        st = new Students();
    }
    
    public int getter_nEmp(){
    
        return this.nEmp;
    }
    
    public void setter_nEmp(int nEmp){
    
        this.nEmp = nEmp;
    }
    
    
    public void showInfo_OuterClass(){
        
            System.out.println("University Name : "+ uniName);
            System.out.println("Total Employees : "+nEmp);
            System.out.println("Students Name : "+st.name);
            System.out.println("Student cmdID : "+ st.id);
        }
    
    public class Students
    {
        
        public String name;
        public String id;
        
        
        public void showInfo_InnerClass(){
        
            System.out.println("University Name : "+ uniName);
            System.out.println("Total Employees : "+nEmp);
            System.out.println("Students Name : "+name);
            System.out.println("Student cmdID : "+ id);
        }
        
   }
    
    public static void main(String args[]){
    
        University uni = new University("Sukkur IBA University");
        University.Students st = uni.new Students();
         
        System.out.println("Number of Employees"+ uni.getter_nEmp());
        uni.setter_nEmp(10);
        System.out.println(uni.getter_nEmp());
        uni.showInfo_OuterClass();
        st.showInfo_InnerClass();
        
        
    
    }
    
    
    
}
