package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDoClearCompleted {
    public static boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }

    public static void clickDotMenu() {
        WebElement buttonDotMenu = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
        buttonDotMenu.click();
    }

    public static void clickClearCompleted() {
        WebElement buttonClearCompleted = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout[contains(@text, 'Clear completed')]"));
        buttonClearCompleted.click();
    }
}
