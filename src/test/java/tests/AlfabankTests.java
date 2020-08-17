package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AlfabankTests {
    @Test
    void creditTest() {

        open("https://alfabank.ru/");
        $(byText("Кредиты")).click();


    }

}