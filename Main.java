public static void main(String args[]) {
    Department d1 = new Department(1001,"SKL co.ltd");
    Department d2 = new Department(1002,"CCL co.ltd","Meang","ChinagMai");
    Employee e1 = new Employee(10001,"Kevin","Rachofsky","Kreavc@gmail.com",d1);
    System.out.println(e1.getDepartment());
    e1.setDepartment(d2);
    System.out.println(e1.toString());
}