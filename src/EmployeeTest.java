import org.omg.CORBA.IntHolder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;

public class EmployeeTest {
    public static void main(String[] args) throws ClassNotFoundException, IOException, InterruptedException {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println(e.toString());
        }

        System.out.println(staff[1].equals(staff[2]));
        System.out.println(Employee.getNextId());
        System.out.println(staff[1].getNext());

        Employee employee = new Employee();
        System.out.println(employee.toString());

        System.out.println(staff[1]);

        System.out.println("===========================================================");

        Employee[] staffs = new Employee[3];
        Manager boss = new Manager("shiny", 80000, 1987, 12, 28);
        System.out.println(boss.toString());
        boss.setBonus(1000);
        staffs[0] = boss;
        staffs[1] = new Employee("Harry", 10000, 1997, 10, 12);
        staffs[2] = new Employee("Carl", 12220, 1986, 12, 9);
        for (Employee e : staffs)
            System.out.println(e.getSalary());

        System.out.println(staffs[0] == boss);

        System.out.println(staffs[1].equals(staffs[2]));
        System.out.println(staffs[0].equals(boss));
        System.out.println(boss.toString());
        System.out.println(staffs[0].toString());
        System.out.println(staffs[0] instanceof Employee);
        System.out.println(staffs[0] instanceof Object);
        System.out.println(staffs[0] instanceof Manager);
        // System.out.println(staffs[0] instanceof Student);
        System.out.println(staffs[0].getClass());
        System.out.println(staffs.toString());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        String s = "OK";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        String t = new String("OK");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("shiny");
        stringArrayList.add("loser");
        System.out.println(stringArrayList.get(1));
        stringArrayList.set(1, "hello");
        System.out.println(stringArrayList.toString());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        Integer integer = 3;
        int  i = integer;
        System.out.println(i);

        Double x = 2.0;
        System.out.println(true? integer : x);

        String s2 = "9991";
        System.out.println(Integer.parseInt(s2));

        // IntHolder intHolder = 3;
        System.out.println(staffs[0].getClass());

        Class<? extends Employee> cl = staffs[0].getClass();
        System.out.println(cl.getClasses());

        String classname = "java.util.Random";
        Class cls = Class.forName(classname);
        System.out.println(cls.getClass());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        // 排序 必须实现 Comparable接口
        Arrays.sort(staffs);
        for(Employee e: staffs){
            System.out.println(e.toString());
        }

        Comparable comparable = new Employee();
        System.out.println(staffs[0] instanceof Comparable);
        System.out.println(comparable instanceof Comparable);
        System.out.println();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        TimePrinter listener = new TimePrinter();
        javax.swing.Timer timer = new javax.swing.Timer(10000, listener);
        timer.start();

        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
        System.out.println(Arrays.deepToString(friends));

        int[] numbers = {2, 3, 4, 5, 6};
        int[] cloned = numbers.clone();
        cloned[1] = 10;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(cloned));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.err.println("ccc");
//        byte[] bytes = {1, 2, 3};
//        System.in.read(bytes);
//        System.out.println();

        // Thread.sleep(1000000);
        TimePrinter.repeat(10, () -> System.out.println("shiny"));


    }
}
