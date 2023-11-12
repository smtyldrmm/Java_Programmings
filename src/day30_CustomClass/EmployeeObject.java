package day30_CustomClass;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 2237, 25, 'M', "Developer", 11000, false);
        employee2.setInfo("Anna", 2287, 28, 'F', "QA", 9000, false);
        employee3.setInfo("David", 2256, 35, 'M', "QA", 85000, true);
        employee4.setInfo("Lina", 2290, 45, 'F', "Manager", 8500, true);
        employee5.setInfo("Kevin", 2298, 35, 'M', "Senior QA", 1000, false);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double maxSalary = employees[0].salary;
        double minSalary = employees[0].salary;
        ;

        for (Employee employee : employees) {
            if (employee.isFullTime) {
                countFullTime++;
            } else {
                countPartTime++;
            }
            if (employee.salary > maxSalary) {
                maxSalary = employee.salary;
            }
            if (employee.salary < minSalary) {
                minSalary = employee.salary;
            }
        }


        System.out.println(countFullTime);
        System.out.println(countPartTime);
        System.out.println(maxSalary);
        System.out.println(minSalary);

    }
}
/*
1-create 5 employee objects
2-store those 5 employee object into a array
3-How many employees are full time employess
4-What's the minimum salary
5-What's the maximum salary
 */




