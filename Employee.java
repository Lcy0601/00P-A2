public class Employee extends Person {
    private String jobTitle;
    private double salary;


    public Employee() {
    }


    public Employee(String name, int age, String address, String jobTitle, double salary) {
        super(name, age, address);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    // Setter方法
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


//class Employee extends Person {
//    private int employeeId;
//    private String department;
//
//    public Employee() {}
//
//    public Employee(String name, int age, String gender, int employeeId, String department) {
//        super(name, age, gender);
//        this.employeeId = employeeId;
//        this.department = department;
//    }
//
//    public int getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(int employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//}


