public class Employee {
    int emp_id;
    String emp_name;
    double emp_salary;
    static String emp_org="TCS";

    public Employee(int emp_id, String emp_name, double emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    public void display() {

        emp_org="Infoysis";  //can use static member in non static method
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Salary: " + emp_salary);
        System.out.println(emp_org);
    }

    public static void emp_info(){
        System.out.println(emp_org);

    }
}
