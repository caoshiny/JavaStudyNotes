package innerClass;

import javax.swing.*;

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "退出");
        System.exit(0);
    }
}
