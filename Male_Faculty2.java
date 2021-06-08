package Projects;

import static java.lang.System.out;
import java.util.Scanner;

class Male_Faculty2 extends Semseter_Project_Write
{
    private String MF_firstname;
    private String MF_lastname;
    private int MF_gradeYear;
    private String MF_teacherID;
    private String MF_courses = "";
    private int MF_salary = 0;
    private static int MF_costofSubject = 2500;
    private static int MF_id = 1000;
    
    
    public Male_Faculty2()
    {
        Scanner scan = new Scanner(System.in);
         out.println("\t\t\t<-------Here Is The Details Of Male-Faculty------->");
        out.print("\t\t\tEnter First Name:  ----> ");
        this.MF_firstname = scan.nextLine();
        
        out.print("\t\t\tEnter Last Name:   ----> ");
        this.MF_lastname = scan.nextLine();
        
        out.print("\t\t\tPlease Enetr Any One Option That Which Faculty Member Belongs: "
                + "\n\t\t\t1-For Freshmen: \n\t\t\t2-For-Senior: \n\t\t\t3-For Junior:"
                + "\n\t\t\tThe Desired result:----> ");
        this.MF_gradeYear = scan.nextInt();
       
        setMF_TeacherID();
        out.println("\t\t\tTeacher ID:-----> " + MF_teacherID);
        
    }
    
    private void setMF_TeacherID()
    {
        MF_id++;
        this.MF_teacherID = MF_gradeYear + "" + MF_id;
    }
    
    public void tech()
    {
        out.print("\t\t\tEnter The Courses That Faculty Teacher Teach:---->"
                    + "\n \t\t\tQ to Quit\n\t\t\t");
        
        do
        {
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            out.print("\t\t\t");
            if(!course.equals("Q"))
            {
                
                MF_courses = MF_courses + "\n"+ "\t\t\t" + course;
                MF_salary = MF_salary + MF_costofSubject;
            }
            else
            {
                break;
            }
            
        }
        while(1 != 0);
            out.println("Subjects teach:----> " +MF_courses);
            out.println("\t\t\tTutior Balance:----> " + MF_salary);
            
    }
    public void viewSalary()
    {
        out.println("\t\t\tYour Salary is:----> " + MF_salary);
    }
    
    public void payTuitor()
    {
        viewSalary();
        out.print("\t\t\tEnter Your amount to transist:----> $");
        Scanner scan = new Scanner(System.in);
        int pyment = scan.nextInt();
        MF_salary = MF_salary - pyment;
        out.println("\t\t\tThank You For Your pyment transist:----> $" + pyment);
        viewSalary();
    }
   
    public String toString()
    {
        return "    \t\t\tName       :----> " + MF_firstname + " " + MF_lastname+
                "\n \t\t\tGrade level:----> " + MF_gradeYear +
                "\n\t\t\tTeacher ID  :----> " + MF_teacherID +
                "\n\t\t\tCourses Tech:----> " + MF_courses +
                "\n\t\t\tSalary      :----> " + MF_salary;
                
                
    }
    
    
}
