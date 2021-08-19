package interf4ce;

public interface Powered extends Moveable{
    double milesPerGallon();
    double SPEED_LIMIT = 95;

    static void printConsole() {
        System.out.println("输出接口中的静态方法！");
    }
}
