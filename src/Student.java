public class Student extends Person{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "a student majoring in " + major;
    }

    public static void main(String[] args) {
        Person shiny = new Student("shiny" , "csgo");
        System.out.println(shiny.getDescription());
        Object obj = new int[10];
    }
}
