package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DstLabPage {

    public DstLabPage openPage() {
        open("/");
        return this;
    }

    public DstLabPage getMenuMarket() {
        $(".menu-item-3251").click();
        return this;
    }

    public DstLabPage checkMenuMarket() {
        $("[data-id = 'b1bd042']").$(".elementor-widget-container").shouldHave(text("Продвижение на маркетплейсе "));
        return this;
    }

    public DstLabPage getMenuSite() {
        $(".menu-item-3250").click();
        return this;
    }

    public DstLabPage checkMenuSite() {
        $("[data-id = 'b1e3c94']").$(".elementor-widget-container").shouldHave(text("Разработка сайтов"));
        return this;
    }

    public DstLabPage getMenuContext() {
        $(".menu-item-3249").click();
        return this;
    }

    public DstLabPage checkMenuContext() {
        $("[data-id = '2cd2aabe']").$(".elementor-widget-container").shouldHave(text("Контекстная реклама Яндекс"));
        return this;
    }

    public DstLabPage getCall() {
        $(".elementor-button-wrapper").$(byText("Заказать звонок")).click();
        return this;
    }

    public DstLabPage checkCall() {
        $("[data-id = '30ab9a2']").$(".elementor-heading-title").shouldHave(text("Заполните форму"));
        return this;
    }


}
