package day31_Constructor.ScrumTask;

public class Developer { public String name;
    public int employeeID;
    public String jobTitle;
    public double Salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary=" + Salary +
                '}';
    }
    public  void coding(){
        System.out.println(name + " is coding");
    }
    public  void unitTesting(){
        System.out.println(name+" is unitTesting");
    }
    public void fixingBug(){
        System.out.println(name+" is fixing Bug");
    }
}

/*
create a class called Developer
        Attributes :
            name, employeeID,jobTitle,Salary
        Add a constructor that can set all the fields

        Actions :
        coding (), unitTesting(), fixingBug(), toString(),
 */


