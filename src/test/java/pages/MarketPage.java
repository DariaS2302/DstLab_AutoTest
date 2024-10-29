package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MarketPage {

    @Step("Проверка открытия страницы Маркетплейсов")
    public void checkMenuMarket() {
        $("[data-id = 'b1bd042']").$(".elementor-widget-container").shouldHave(text("Продвижение на маркетплейсе "));
    }
}
