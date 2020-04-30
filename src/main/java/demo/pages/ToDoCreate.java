package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ToDoCreate {
    public static void clickAdd() {
        WebElement buttonAdd = AndroidDriverInstance.androidDriver.findElement(By.id("fab_add_task"));
        buttonAdd.click();
    }

    public void inputToDoTitle(String keyword){
        WebElement inputSearch = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_title"));
        inputSearch.sendKeys(keyword);
    }

    public static boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }

    public static void clickDone() {
        WebElement buttonDone = AndroidDriverInstance.androidDriver.findElement(By.id("fab_edit_task_done"));
        buttonDone.click();
    }
}
