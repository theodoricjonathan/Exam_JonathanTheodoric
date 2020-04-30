package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageWikipedia {

    WebElement inputSearch;
    String kword = "";

    public void openHomePage() {
        WebDriverInstance.driver.get("http://www.google.com");
    }

    public void inputSearch(String keyword) {
        WebElement inputSearch = WebDriverInstance.driver.findElement(By.id("searchInput"));
        inputSearch.sendKeys(keyword);
    }

    public void pressEnter() {
        inputSearch.sendKeys(kword, Keys.ENTER);
    }

    public String getPokemonName() {
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.driver, 10);
        //WebElement PokemonNumber = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //td[@class='roundy']//table//tbody//tr//td//big//big")));
        WebElement PokemonNumber = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//big/b")));
        String name = PokemonNumber.getText();
        return name;
    }

    public void clickSearchResult() {
        WebElement buttonSearchResult = WebDriverInstance.driver.findElement((By.xpath("//h3[contains(text(),'Pikachu)")));
        buttonSearchResult.click();
    }

}

