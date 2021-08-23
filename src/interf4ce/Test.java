package interf4ce;

import java.awt.event.MouseEvent;

public class Test implements Powered, Cloneable, defaultInterface{
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

    // 覆盖默认方法
    public void defaultFunc() {
        System.out.println("覆盖defaultInterface的默认方法");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.milesPerGallon();

        //
        test.defaultFunc();
        defaultInterface defaultInterface = new Test();
        defaultInterface.defaultFunc();


        Powered.printConsole();
        Test.printConsole();
    }
}
