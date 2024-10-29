package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ContexPage {

    @Step("Проверка открытия страницы Контекстная реклама")
    public void checkMenuContext() {
        $("[data-id = '2cd2aabe']").$(".elementor-widget-container").shouldHave(text("Контекстная реклама Яндекс"));
    }
}
