package stepdefinitions;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.IPageObject;

@ScenarioScoped
public class StepDefinition {
    @Inject
    IPageObject testPage;

    @Given("this is an example")
    public void thisIsAnExample() {
        this.testPage.testThisPageShout();
    }

    @When("the user wants to whisper a value")
    public void userWantsToWhisperValue(){
        this.testPage.testThisPageWhisper();
    }
}
