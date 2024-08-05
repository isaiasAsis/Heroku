package co.com.heroku.test.userinterface;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HerokuRegisterPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to register")
            .located(By.xpath("//*[@id=\"btn-make-appointment\"]"));
    public static final Target INPUT_USER_NAME = Target.the("where do we write the user name")
            .located(By.id("txt-username"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write password")
            .located(By.id("txt-password"));
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("//*[@id=\"btn-login\"]"));
    public static final Target SELECT_FACILITY = Target.the("When we want to select the appointment facility")
            .located(By.id("combo_facility"));
    public static final Target CHECK_REDMISION = Target.the("Click to request hospital readmission")
            .located(By.xpath("/html/body/section/div/div/form/div[2]/div/label"));
    public static final Target RADIO_HEALTCARE_PROGRAM= Target.the("When we want to select the medical care program")
            .located(By.id("radio_program_medicaid"));
    public static final Target INPUT_VISIT_DATE= Target.the("When we want to enter the date of visit")
            .located(By.id("txt_visit_date"));
    public static final Target INPUT_COMMENT = Target.the("When we want to add comments")
            .located(By.id("txt_comment"));
    public static final Target BOOK_APPOINMENT_BUTTON = Target.the("button that shows us the form to register")
            .located(By.id("btn-book-appointment"));
    public static final Target LABEL_SUCCESS = Target.the("Appointment Confirmation")
            .located(By.xpath("//*[@id=\"summary\"]/div/div/div[1]/h2"));
}
