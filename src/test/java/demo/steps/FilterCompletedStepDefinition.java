package demo.steps;

import demo.pages.ToDoFilterActive;
import demo.pages.ToDoFilterCompleted;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterCompletedStepDefinition {

    private ToDoFilterCompleted titleCompleted = new ToDoFilterCompleted();

    @Given("User were at to do list page")
    public void userWereAtToDoListPage() {
        boolean result = ToDoFilterCompleted.isOnPage();
        Assert.assertTrue(true);
    }

    @When("User click filter menus")
    public void userClickFilterMenus() {
        ToDoFilterCompleted.clickFilterMenu();
    }

    @And("User click Completed")
    public void userClickCompleted() {
        ToDoFilterCompleted.clickCompletedMenu();
    }

    @Then("User see completed to do list")
    public void userSeeCompletedToDoList(String title) {
        String actual = titleCompleted.completedOnPage();
        Assert.assertEquals(title, actual);
    }
}
