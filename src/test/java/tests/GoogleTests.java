package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.GooglePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Epic("QA.GURU automation course")
@Story("Google tests")
@Tag("google")
class GoogleTests extends TestBase {

    @Test
    @Description("Positive test with testid")
    void successfulSearch() {
        open("http://google.com");

        $(byName("q")).val("lepra").pressEnter();

        $("html").shouldHave(text("Лепрозорий: вход"));
    }

    // Копия предыдущего теста, но с "попрятанной логикой"
    @Test
    @Description("Positive test with testid with PO")
    void successfulSearchWithPO() {
        GooglePage googlePage = new GooglePage();

        open("http://google.com");

        googlePage.typeSearch("lepra");

        googlePage.verifySearchHasResult("Лепрозорий: вход");
    }

}