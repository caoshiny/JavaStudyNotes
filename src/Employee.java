import java.time.LocalDate;

public class Employee implements Comparable<Employee>       {
    private static int nextId = 1;

    private int id;
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day){
        this();
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(){
        //this("cao", 10000, 1997, 12, 8);
        System.out.println("无参构造函数");
        name = "";
        salary = 0;
        hireDay = LocalDate.now();
    }

    public int compareTo(Employee otherObject){
        return Double.compare(salary, otherObject.getSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Employee other){
        return name.equals(other.name);
    }

    public static int getNextId() {
        return nextId;
    }

    public int getNext() {
        return nextId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    public static void main(String[] args) {
        Employee e = new Employee("Remo", 50000, 2003, 3, 31);
        e.raiseSalary(10);
        System.out.println(e.toString());
    }

    public void overload(int x, String y) {
        System.out.println("返回值为void");
    }

    public void overload(int x) {
        int a;
        System.out.println("返回值为int");
    }
}
