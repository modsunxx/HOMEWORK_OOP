public class Employee {
    private int empID;
    private String firstName;
    private String lastName;
    private String email;
    private Department department;

    public Employee(int empID,String firstName,String lastName,String email,Department department){
        this.empID = empID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }
    public int getEmpID() {
        return empID;
    }
    public Department getDepartment() {
        return department;
    }
    public String Name() {
        return firstName+" "+lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Employee ID : " + empID + "\n" +
               "Name : " + firstName + " " + lastName + "\n" +
               "Email : " + email + "\n" +
               "DepartmentID : " + department.getDepID() + "\n" +
               "Name : " + department.getName() + "\n" +
               "Address : " + department.getCity() + ", " + department.getProvince();
    }
}


