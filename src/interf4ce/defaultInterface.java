package interf4ce;

import java.awt.event.MouseEvent;

/**
 * 把声名的所有方法设置为默认方法，只需覆盖真正关心的事件
 */
public interface defaultInterface {
    default void mouseClicked(MouseEvent event) {
        System.out.println("发生了鼠标点击事件");
    }
    default void mousePressed(MouseEvent event) {}
    default void mouseRelease(MouseEvent event) {}
    default void mouseEnter(MouseEvent event) {}
    default void mouseExited(MouseEvent event) {}

    default void defaultFunc () {
        System.out.println("调用defaultInterface的默认方法");
    }
}
