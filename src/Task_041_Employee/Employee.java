package Task_041_Employee;

public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;
    private int actualYear=2021;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tax();
        bonus();

    }



    public double tax(){
        if(salary<1000){
            return 0;
        }else{
            return salary*0.03;
        }
    }

    public void bonus(){
        if(workHours>40) salary+=(workHours-40)*30;
    }


    public void raiseSalary(){

        if((actualYear-hireYear)<10){
            salary=salary*1.05;
        }else if((actualYear-hireYear)<20){
            salary=salary*1.1;
        }else{
            salary=salary*1.15;
        }

    }


    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", Salary=" + salary +
                ", Work Hours=" + workHours +
                ", Hire Year=" + hireYear +
                '}';
    }
}
