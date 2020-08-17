package tests;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Epic("QA.GURU automation course")
@Tag("tempmail")

public class TempmailTests {
    @Test
    void newUserRegistrationShouldWork() {
    // создать подряд 2 почты с рандомным именем ящика

       open("https://temp-mail.org/ru/");
    }
}