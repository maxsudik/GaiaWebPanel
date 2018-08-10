package Helper;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class GaiaHelper {

    public void Wait1() {
        //Add delay 1 sec
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Wait3() {
        //Add delay 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Wait5() {
        //Add delay 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Wait10() {
        //Add delay 10 sec
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void AcceptAlerts(IOSDriver mobiledriver) {
        try {
            mobiledriver.switchTo().alert().accept();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

