package demo.steps;

import demo.pages.ToDoCheck;
import demo.pages.ToDoClearCompleted;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckToDoStepDefinition {
    @Given("User at homepage")
    public void userAtHomepage() {
        boolean result = ToDoCheck.isOnPage();
        Assert.assertTrue(true);
    }

    @Then("User click checkmark")
    public void userClickCheckmark() {
        ToDoCheck.clickCheckList();
    }
}
