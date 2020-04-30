package demo.webdriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInstance {
    public static AndroidDriver<AndroidElement> androidDriver;
    public static void initialize(){
        String appiumUrl = "http://127.0.0.1:4723/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "device");
        caps.setCapability("app", "C:\\Users\\Jonathan Theodoric\\Desktop\\Basecamp\\automation\\TodoApp.apk");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("platformVersion", "9");
        caps.setCapability("autoAcceptAlerts", "true");

        try {
            androidDriver = new AndroidDriver<>(new URL(appiumUrl), caps);
            androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();

        }
    }

    public static void quit(){
        androidDriver.quit();
    }
}
