package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DstLabPage {

    @Step("Открываем главную страницу")
    public void openPage() {
        open("/");
    }

    @Step("Клик по меню Маркетплейсы")
    public void getMenuMarket() {
        $(".menu-item-3251").click();
    }

    @Step("Проверка открытия страницы Маркетплейсов")
    public void checkMenuMarket() {
        $("[data-id = 'b1bd042']").$(".elementor-widget-container").shouldHave(text("Продвижение на маркетплейсе "));
    }

    @Step("Клик по меню Создание сайтов")
    public void getMenuSite() {
        $(".menu-item-3250").click();
    }

    @Step("Проверка открытия страницы Создания сайтов")
    public void checkMenuSite() {
        $("[data-id = 'b1e3c94']").$(".elementor-widget-container").shouldHave(text("Разработка сайтов"));
    }

    @Step("Клик по меню Контекстная реклама")
    public void  getMenuContext() {
        $(".menu-item-3249").click();
    }

    @Step("Проверка открытия страницы Контекстная реклама")
    public void checkMenuContext() {
        $("[data-id = '2cd2aabe']").$(".elementor-widget-container").shouldHave(text("Контекстная реклама Яндекс"));
    }

    @Step("Клик по кнопке Заказать звонок")
    public void getCall() {
        $(".elementor-button-wrapper").$(byText("Заказать звонок")).click();
    }

    @Step("Проверка открытия формы для заказа звонка")
    public void checkCall() {
        $("[data-id = '30ab9a2']").$(".elementor-heading-title").shouldHave(text("Заполните форму"));
    }

}
