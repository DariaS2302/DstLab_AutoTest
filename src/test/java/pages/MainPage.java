package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    @Step("Открываем главную страницу")
    public void openPage() {
        open("/");
    }

    @Step("Клик по меню Маркетплейсы")
    public void getMenuMarket() {
        $(".menu-item-3251").click();
    }

    @Step("Клик по меню Создание сайтов")
    public void getMenuSite() {
        $(".menu-item-3250").click();
    }

    @Step("Клик по меню Контекстная реклама")
    public void  getMenuContext() {
        $(".menu-item-3249").click();
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
