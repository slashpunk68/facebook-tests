package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static helpers.Environment.*;
import pages.GooglePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Epic("QA.GURU automation course")
@Story("Yandex tests")
@Tag("yandex")
class YandexTests extends TestBase {

    // 1. Тест на проверку поиска товара в яндекс.маркете
    //
    //- Зайти на яндекс.маркет
    //
    //- Вбить в поиск товар “[холодильник]”
    //
    //- Открыть первый товар, появившийся в списке
    //
    //- Проверить, что в карточке товара присутствует текст “item”
    //
    //item - передаем значение из терминала, т.е. тест должен работать с любым товаром
    //gradle yandex_tests Durl=http://market.yandex.ru -Dsearchitem="Холодильник"

    @Test
    @Description("Positive test with testid")
    void successfulSearch() {
        Configuration. timeout = 10000;
        open(urlyandex);

        $("#header-search").val(searchitem).pressEnter();



        $(".n-snippet-card2__header").click();
    $("h1").shouldHave(text(searchitem));
    }


}