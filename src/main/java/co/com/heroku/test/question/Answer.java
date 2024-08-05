package co.com.heroku.test.question;

import co.com.heroku.test.userinterface.HerokuRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    public static Answer thePage() {
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String success = Text.of(HerokuRegisterPage.LABEL_SUCCESS).answeredBy(actor).toString();
        return success.equals("Appointment Confirmation");
    }
}
