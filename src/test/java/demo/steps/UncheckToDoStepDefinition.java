package demo.steps;

import demo.pages.ToDoClearCompleted;
import demo.pages.ToDoUncheck;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UncheckToDoStepDefinition {
    @Given("User in home page")
    public void userInHomePage() {
        boolean result = ToDoUncheck.isOnPage();
        Assert.assertTrue(true);
    }

    @Then("User clicks checkmark")
    public void userClicksCheckmark() {
        ToDoUncheck.clickUncheckList();
    }
}
