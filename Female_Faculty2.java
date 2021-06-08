package Projects;


import static java.lang.System.out;
import java.util.Scanner;

class Female_Faculty2 extends Semseter_Project_Write
{
    private String FM_firstname;
    private String FM_lastname;
    private int FM_gradeYear;
    private String MF_madamID;
    private String FM_courses = "";
    private int FM_salary = 0;
    private static int FM_costofSubject = 5000;
    private static int FM_id = 11100;
    
    public Female_Faculty2()
    {
        Scanner scan = new Scanner(System.in);
         out.println("\t\t\t<-------Here Is The Details Of Female-Faculty------->");
        out.print("\t\t\tEnter First Name:  ----> ");
        this.FM_firstname = scan.nextLine();
        
        out.print("\t\t\tEnter Last Name:  ----> ");
        this.FM_lastname = scan.nextLine();
        
        out.print("\t\t\tPlease Enter Any One Option That Which Faculty Member Belongs:- "
                + "\n\t\t\t1-For New Member\n\t\t\t2-For-Senior\n\t\t\t3-For Junior"
                + "\n\t\t\tThe Desired result:---->");
        this.FM_gradeYear = scan.nextInt();
        setFM_teacherID();
        out.println("\t\t\tMadam ID: " + MF_madamID);
        
        
    }
    private void setFM_teacherID()
    {
        FM_id++;
        this.MF_madamID = FM_gradeYear + "" + FM_id;
    }
     public void tech()
    {
        out.print("\t\t\tEnter The Courses That Female Teach:"
                    + "\n \t\t\tQ to Quit\n\t\t\t");
        do
        {
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            out.print("\t\t\t");
            if(!course.equals("Q"))
            {
                FM_courses = FM_courses + "\n" + "\t\t\t"+ course;
                FM_salary = FM_salary + FM_costofSubject;
            }
            else
            {
                break;
            }
            
        }
        while(1 != 0);
            out.println("Subjects teach:----> " + FM_courses);
            out.println("\t\t\tTutior balance:----> " + FM_salary);
            
    }
     
     public void viewSalary()
    {
        out.println("\t\t\tYour Salary is:----> " + FM_salary);
    }
     public void payTuitor()
    {
        viewSalary();
        out.print("\t\t\tEnter Your amount to transist:----> $");
        Scanner scan = new Scanner(System.in);
        int pyment = scan.nextInt();
        FM_salary = FM_salary - pyment;
        out.println("\t\t\tThank You For Your pyment transist:----> $" + pyment);
        viewSalary();
    }
     public String toString()
    {
        return "   \t\t\tName        :----> " + FM_firstname + " " + FM_lastname+
                "\n \t\t\tGrade level:----> " + FM_gradeYear +
                "\n\t\t\tTeacher ID  :----> " + MF_madamID +
                "\n\t\t\tCourses Tech:----> " + FM_courses +
                "\n\t\t\tSalary      :----> " + FM_salary;
                
                
    }
     
     
    
    
}