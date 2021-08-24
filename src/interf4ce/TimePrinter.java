package interf4ce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }


    public static void main(String[] args) throws InterruptedException {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(2000, listener);
        // 启动
//        t.start();
//        JOptionPane.showMessageDialog(null, "Quit program?");
//        System.exit(0);

        // lambda表达式
        Timer t1 = new Timer(2000, event -> {
            System.out.println("At the tone, the time is "  + new Date());
        });
        t1.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
