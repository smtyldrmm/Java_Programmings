package day31_Constructor.ScrumTask;

public class Tester {  public String name;
    public int employeeID;
    public String jobTitle;
    public double Salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        Salary = salary;
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public  void smokeTesting(){
        System.out.println(name+" is smoking");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating Ticket");
    }

}

/*
create a  class called Tester
        Attributes:
            name,employeeID,jobTitle,Salary

        Add a constructor that can set all the fields

        Actions :
            smokeTesting(), creatingTicket(), dailyStandUp(), toString(),
 */


