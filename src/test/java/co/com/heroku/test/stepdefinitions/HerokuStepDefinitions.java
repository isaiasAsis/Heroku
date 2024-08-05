package co.com.heroku.test.stepdefinitions;

import co.com.heroku.test.question.Answer;
import co.com.heroku.test.task.OpenUp;
import co.com.heroku.test.task.Join;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class HerokuStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Isaias wants to fill out the appointment registration form on the heroku page")
    public void isaiasWantsToFillOutTheAppointmentRegistrationFormOnTheHerokuPage() {
        OnStage.theActorCalled("Isaias").wasAbleTo(OpenUp.thePage());
    }
    @When("enter information on the registration page")
    public void enterInformationOnTheRegistrationPage(){
        OnStage.theActorInTheSpotlight().attemptsTo(Join.thePage());
    }
    @Then("register the appointment satisfactorily")
    public void registerTheAppointmentSatisfactorily() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.thePage()));
    }

}
