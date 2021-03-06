package tests;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.email;
import static helpers.Environment.url;

@Epic("QA.GURU automation course")
class CssXpathExamplesTests extends TestBase {

    @Test
    void cssXpathExamples() {
        open(url);

        // эталон
        $(by("data-testid", "royal_email")).setValue(email);

        // другие возможности сделать тоже самое
        $("#email").setValue(email);
        $(byId("email")).setValue(email);
        $("[id='email']").setValue(email);
        $("input[id='email']").setValue(email);
        $("input#email").setValue(email);
        $x("//input[@id='email']").setValue(email);
        $x("//*[@id='email']").setValue(email);

        $(byName("email")).setValue(email);
        $("[name='email']").setValue(email);
        $("input[name='email']").setValue(email);
        //тоже самое с xpath

        $(byClassName("login_form_input_box")).setValue(email);
        $(".login_form_input_box").setValue(email);
        $(".inputtext.login_form_input_box").setValue(email);
        $("input.inputtext.login_form_input_box").setValue(email);
        $("input.inputtext.login_form_input_box#email").setValue(email);
        $x("//*[@class='login_form_input_box']").setValue(email);

    }

}
