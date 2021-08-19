package interf4ce;

import java.awt.event.MouseEvent;

/**
 * 把声名的所有方法设置为默认方法，只需覆盖真正关心的事件
 */
public interface defaultInterface {
    default void mouseClicked(MouseEvent event) {}
    default void mousePressed(MouseEvent event) {}
    default void mouseRelease(MouseEvent event) {}
    default void mouseEnter(MouseEvent event) {}
    default void mouseExited(MouseEvent event) {}
}
