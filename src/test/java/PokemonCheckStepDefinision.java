import demo.pages.HomePageWikipedia;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PokemonCheckStepDefinision {

    private HomePageWikipedia homePage = new HomePageWikipedia();

    @Given("User open google home page")
    public void userOpenGoogleHomePage() {
        homePage.openHomePage();
    }

    @When("User input {string} on homepage")
    public void userInputOnHomepage(String keyword) {
        homePage.inputSearch(keyword);
    }

    @And("User click enter")
    public void userClickEnter() {
        homePage.pressEnter();
    }

    @Then("User see search result with title {string}")
    public void userSeeSearchResultWithTitle(String name) {
        Assert.assertEquals(name, homePage.getPokemonName());
    }

    @When("User click the first search result")
    public void userClickTheFirstSearchResult() {

    }

    @Then("User see page about {string}")
    public void userSeePageAbout(String arg0) {
    }

    @And("User see the Pokemon number is {string}")
    public void userSeeThePokemonNumberIs(String arg0) {
    }
}
