package Practice;

public class Main_Class 
{
    
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
