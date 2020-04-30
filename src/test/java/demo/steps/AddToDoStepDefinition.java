package demo.steps;

import demo.pages.ToDoCreate;
import demo.pages.ToDoCheckStatistic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddToDoStepDefinition {

    private ToDoCheckStatistic toDoCheckStatistic = new ToDoCheckStatistic();
    private ToDoCreate toDoCreate = new ToDoCreate();

    @Given("User is on to do list page")
    public void userIsOnToDoListPage() {
        boolean result = ToDoCheckStatistic.isOnPage();
        Assert.assertTrue(true);
    }

    @When("User click add task")
    public void userClickAddTask() {
        ToDoCreate.clickAdd();
    }

    @And("User input {string}")
    public void userInput(String keyword) {
        toDoCreate.inputToDoTitle(keyword);
    }

    @Then("User click done")
    public void userClickDone() {
        ToDoCreate.clickDone();
    }
}

