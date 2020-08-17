package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;
import static utils.RandomUtils.getRandomString;

@Epic("QA.GURU automation course")
@Story("VkTests tests")
@Tag("Vk")
class VkTests extends TestBase {

    @Test
    @Description("login in Vk")
    void successfulLoginWithTestId() {
       //открываем Vk, логинимся
        String randomText = getRandomString(3);
        open(urlVK);
        $("#email").setValue(phoneNumber);
        $("#pass").setValue(passwordVk);
        $("#login_button").click();
       //клик на "что у Вас нового? и вставка текста "всё"
        $(byText("Моя страница")).click();
        $("#post_field").click();
        $("#post_field").setValue(randomText);
        $("div.addpost_button_wrap").click();
        $("._post_content").shouldHave(text(randomText));


    }

}

