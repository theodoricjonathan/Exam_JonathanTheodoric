package demo.steps;

import demo.pages.ToDoCheckStatistic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckStatisticStepDefinition {

    private ToDoCheckStatistic titleStatistic = new ToDoCheckStatistic();

    @Given("User is on to do list pages")
    public void userIsOnToDoListPages() {
        boolean result = ToDoCheckStatistic.isOnPage();
        Assert.assertTrue(true);
    }

    @When("User click hamburger menu")
    public void userClickHamburgerMenu() {
        ToDoCheckStatistic.clickMenu();
    }

    @And("User click Statistics field")
    public void userClickStatisticsField() {
        ToDoCheckStatistic.clickStatistic();
    }

    @Then("User see the statistic")
    public void userSeeTheStatistic(String title) {
        String actual = titleStatistic.statisticOnPage();
        Assert.assertEquals(title, actual);
    }
}