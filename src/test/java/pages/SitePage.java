package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SitePage {

    @Step("Проверка открытия страницы Создания сайтов")
    public void checkMenuSite() {
        $("[data-id = 'b1e3c94']").$(".elementor-widget-container").shouldHave(text("Разработка сайтов"));
    }

}
