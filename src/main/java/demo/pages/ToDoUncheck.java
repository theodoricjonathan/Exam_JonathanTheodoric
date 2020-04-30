package demo.pages;
import demo.webdriver.AndroidDriverInstance;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ToDoUncheck {
    public static boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }

    public static void clickUncheckList() {
        WebElement buttonUncheckList = AndroidDriverInstance.androidDriver.findElement(By.id("complete"));
        buttonUncheckList.click();
    }
}
