package demo.steps;

import demo.pages.ToDoCheckStatistic;
import demo.pages.ToDoFilterActive;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterActiveStepDefinition {

    private ToDoFilterActive titleActive = new ToDoFilterActive();

    @Given("User on to do list page")
    public void userOnToDoListPage() {
        boolean result = ToDoFilterActive.isOnPage();
        Assert.assertTrue(true);
    }

    @When("User click filter menu")
    public void userClickFilterMenu() {
        ToDoFilterActive.clickFilterMenu();
    }

    @And("User click Active")
    public void userClickActive() {
        ToDoFilterActive.clickActiveMenu();
    }

    @Then("User see active to do list")
    public void userSeeActiveToDoList(String title) {
        String actual = titleActive.activeOnPage();
        Assert.assertEquals(title, actual);
    }


}
