package demo.steps;

import demo.pages.ToDoCheckStatistic;
import demo.pages.ToDoClearCompleted;
import demo.pages.ToDoRefresh;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ClearCompletedStepDefinition {
    @Given("User at home page")
    public void userAtHomePage() {
        boolean result = ToDoClearCompleted.isOnPage();
        Assert.assertTrue(true);
    }

    @When("User click more option")
    public void userClickMoreOption() {
        ToDoClearCompleted.clickDotMenu();
    }

    @Then("User click clear completed")
    public void userClickClearCompleted() {
        ToDoClearCompleted.clickClearCompleted();
    }
}
