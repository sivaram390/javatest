//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package section3JavaGettingStarted;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class UtilsTest {
    public static final int fiveSecond = 5000;
    public static final int maxX = 300;
    public static final int maxy = 300;

    public UtilsTest() {
    }

    public static void main(String[] args) throws InterruptedException, AWTException {
        Robot robot = new Robot();
        Random random = new Random();

        while(true) {
            robot.mouseMove(random.nextInt(maxX), random.nextInt(maxy));
            Thread.sleep(5000L);
        }
    }
}
