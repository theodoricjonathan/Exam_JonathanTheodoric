package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDoCheckStatistic {
    public static boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }

    public static void clickMenu() {
        WebElement buttonMenu = AndroidDriverInstance.androidDriver.findElement((By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")));
        buttonMenu.click();
    }

    public static void clickStatistic(){
        WebElement buttonSearch = AndroidDriverInstance.androidDriver.findElement((By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[contains(@text, 'Statistics')]")));
        buttonSearch.click();
    }

    public String statisticOnPage() {
        WebElement titleStatistic = WebDriverInstance.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[contains(@text, 'Statistics')]"));
        String title = titleStatistic.getText();
        return title;
    }
}
