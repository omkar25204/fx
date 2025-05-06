public class Employee {
    String name;
    int id;
    double salary;
    int phno;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phno = phno;
    }
    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
         System.out.println("phno: " + phno);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 101, 50000.0);
        emp1.displayinfo();
    }
}