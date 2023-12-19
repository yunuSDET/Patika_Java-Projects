package Task_041_Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee=new Employee("Yunus",3500,42,1999);

        System.out.println(employee);

        employee.raiseSalary();

        System.out.println(employee);

    }
}
