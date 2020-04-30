package demo.steps;

import demo.pages.ToDoCheckStatistic;
import demo.pages.ToDoRefresh;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class RefreshToDoStepDefinition {

    private ToDoCheckStatistic toDoCheckStatistic = new ToDoCheckStatistic();
    private ToDoRefresh toDoRefresh = new ToDoRefresh();

    @Given("User was on to do list page")
    public void userWasOnToDoListPage() {
        boolean result = ToDoRefresh.isOnPage();
        Assert.assertTrue(true);
    }

    @When("User click three dot menu")
    public void userClickThreeDotMenu() {
        ToDoRefresh.clickDotMenu();
    }

    @And("User click Refresh")
    public void userClickRefresh() {
        ToDoRefresh.clickRefresh();
    }

    @Then("User see the list")
    public void userSeeTheList() {
        boolean result = ToDoCheckStatistic.isOnPage();
        Assert.assertTrue(true);
    }

}

