package Projects;

import static java.lang.System.out;
import java.util.Scanner;

class Lower_Staff2 extends Semseter_Project_Write
{
    private String LS_firstname;
    private String LS_lastname;
    private int LS_gradeYear;
    private String LS_peonID;
    private String LS_works = "";
    private int LS_salary = 0;
    private static int LS_costofwork = 1500;
    private static int LS_id = 1000;
    
    
    public Lower_Staff2()
    {
        Scanner scan = new Scanner(System.in);
        out.println("\t\t\t<-------Here Is The Details Of Lower-Staff------->");
        out.print("\t\t\tEnter First Name:  ----> ");
        this.LS_firstname = scan.nextLine();
        
        out.print("\t\t\tEnter Last Name:   ----> ");
        this.LS_lastname = scan.nextLine();
        
        out.print("\t\t\tPlease Enetr any one option that which faculty member belongs:- "
                + "\n\t\t\t1-For Freshmen\n \t\t\t2-For-Senior\n\t\t\t 3-For Junior"
                + "\n\t\t\tThe Desired result:----> ");
        this.LS_gradeYear = scan.nextInt();
        setLS_PeonID();
        out.println("\t\t\tTeacher ID:-----> " + LS_peonID);
        
    }
    
    private void setLS_PeonID()
    {
        LS_id++;
        this.LS_peonID = LS_gradeYear + "" + LS_id;
    }
    
    public void Works()
    {
        out.print("\t\t\tEnter The Works That Lower-Staff :----->"
                    + "\n\t\t\t Q to Quit\n\t\t\t");
        do
        {
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            out.print("\t\t\t");
           
            if(!course.equals("Q"))
            {
                LS_works = LS_works + "\n" + "\t\t\t" + course;
                LS_salary = LS_salary + LS_costofwork;
            }
            else
            {
                break;
            }
            
        }
        while(1 != 0);
            out.println("Works Performs:----> " + LS_works);
            out.println("\t\t\tWorker Balance:----> " + LS_salary);
            
    }
    public void viewSalary()
    {
        out.println("\t\t\tYour Salary is:---->" + LS_salary);
    }
    
    public void payWork()
    {
        viewSalary();
        out.print("\t\t\tEnter Your amount to transist:----> $");
        Scanner scan = new Scanner(System.in);
        int pyment = scan.nextInt();
        LS_salary = LS_salary - pyment;
        out.println("\t\t\tThank You For Your pyment transist:----> $" + pyment);
        viewSalary();
    }
   
    public String toString()
    {
        return "\n\t\t\tName           :----> " + LS_firstname + " " + LS_lastname+
                "\n \t\t\tGrade level  :----> " + LS_gradeYear +
                "\n\t\t\tLower-Staff ID:----> " + LS_peonID +
                "\n\t\t\tWorks perform :----> " + LS_works +
                "\n\t\t\tSalary        :----> " + LS_salary;
                
                
    }
    
    
}
