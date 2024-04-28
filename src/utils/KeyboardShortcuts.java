package utils;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardShortcuts {
        public static Robot robot;
    public static void altTab() {
        try{
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_META);
        } catch(AWTException e){
            throw new RuntimeException(e);
        }
    }

    public static void intellijRun() {
        try{
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_META);
        } catch (AWTException e){
            throw new RuntimeException(e);
        }
    }

    public static void copy() {
        try{
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_COPY);
            robot.keyRelease(KeyEvent.VK_COPY);
        } catch(AWTException e){
            throw new RuntimeException(e);
        }
    }
}
