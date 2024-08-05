package co.com.heroku.test.task;

import co.com.heroku.test.userinterface.HerokuRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Join implements Task {

    public static Join thePage() {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HerokuRegisterPage.JOIN_BUTTON),
                Click.on(HerokuRegisterPage.INPUT_USER_NAME),
                Enter.theValue("John Doe").into(HerokuRegisterPage.INPUT_USER_NAME),
                Click.on(HerokuRegisterPage.INPUT_PASSWORD),
                Enter.theValue("ThisIsNotAPassword").into(HerokuRegisterPage.INPUT_PASSWORD),
                Click.on(HerokuRegisterPage.LOGIN_BUTTON),
                Click.on(HerokuRegisterPage.SELECT_FACILITY),
                Hit.the(Keys.ARROW_DOWN).into(HerokuRegisterPage.SELECT_FACILITY),
                Hit.the(Keys.ENTER).into(HerokuRegisterPage.SELECT_FACILITY),
                Click.on(HerokuRegisterPage.CHECK_REDMISION),
                Click.on(HerokuRegisterPage.RADIO_HEALTCARE_PROGRAM),
                Click.on(HerokuRegisterPage.INPUT_VISIT_DATE),
                Enter.theValue("04/09/2024").into(HerokuRegisterPage.INPUT_VISIT_DATE),
                Click.on(HerokuRegisterPage.INPUT_COMMENT),
                Enter.theValue("No comments").into(HerokuRegisterPage.INPUT_COMMENT),
                Click.on(HerokuRegisterPage.BOOK_APPOINMENT_BUTTON)
                );
    }

}
