package interf4ce;

public class Test implements Powered, Cloneable{
    public void move (double x, double y){
        System.out.println("物体移动了！");
    }

    public double milesPerGallon() {
        System.out.println(SPEED_LIMIT);
        return 1.0/2;
    }

    public static void printConsole()
    {
        System.out.println("覆盖实现接口静态函数！");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.milesPerGallon();
        Powered.printConsole();
        Test.printConsole();
    }
}
