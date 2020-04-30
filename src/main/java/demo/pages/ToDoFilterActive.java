package demo.pages;
import demo.webdriver.AndroidDriverInstance;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ToDoFilterActive {
    public static boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }

    public static void clickFilterMenu() {
    WebElement buttonFilterMenu = AndroidDriverInstance.androidDriver.findElement(By.id("menu_filter"));
        buttonFilterMenu.click();
    }

    public static void clickActiveMenu() {
        WebElement buttonActiveMenu = AndroidDriverInstance.androidDriver.findElement(By.xpath("arLayout[2]/android.widget.RelativeLayout/android.widget.TextView[contains(@text, 'Active')]"));
        buttonActiveMenu.click();
    }

    public String activeOnPage() {
        WebElement titleActive = WebDriverInstance.driver.findElement(By.id("filteringLabel[contains(@text, 'Active TO-DOs')]"));
        String title = titleActive.getText();
        return title;
    }
}
