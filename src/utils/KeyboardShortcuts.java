package utils;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardShortcuts {
        public static Robot robot = null;
    public static void altTab() throws AWTException {
        robot = new Robot();
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
    }

    public static void intellijRun() throws AWTException {
        robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_R);
    }
}
