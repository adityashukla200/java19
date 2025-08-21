public class MyEmp {
    static {
        System.out.println("I am in a static block");
    }
    public static void main(String[] args) {
//        Employee e1 = new Employee(12,"Aditya",100000);
//        e1.display();
        Employee.emp_info();
    }

}
