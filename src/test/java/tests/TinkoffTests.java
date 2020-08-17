package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static helpers.Environment.*;
import static utils.RandomUtils.getRandomString;

@Epic("QA.GURU automation course")
@Story("Tinkoff tests")
@Tag("Tinkoff")
class TinkoffTests extends TestBase {

    @Test
    @Description("Open Tinkoff.ru, press button 'вклады'")
    void successfulOpenDepositSection() {
        open("http://tinkoff.ru./");
        $("[data-index='2']").click();
        $("[data-qa-data='uikit/pageHeader']").shouldHave(text("Вклады"));
    }

    @Test
    @Description("Open Tinkoff.ru, press button 'вклады'")
    void successfulOpenDepositSectionByQaDataType() {
        open("http://tinkoff.ru./");
        $("[data-qa-type='uikit/tabsWithDroplist.item']",2).click();
        $("[data-qa-data='uikit/pageHeader']").shouldHave(text("Вклады"));
    }

    @Test
    @Description("Open Tinkoff.ru, press button 'вклады'")
    void successfulOpenDepositSectionByHref() {
        open("http://tinkoff.ru./");
        $("[href='/deposit/']").click();
        $("[data-qa-data='uikit/pageHeader']").shouldHave(text("Вклады"));
    }

}

