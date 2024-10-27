package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DstLabPage;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

@Tag("dstLabTests")
public class DstLabTest extends TestBase {

   private final DstLabPage dstLabPage = new DstLabPage();

    @Test
    @Tag("menuMarketPlaceTest")
    @DisplayName("Проверка перехода в меню Маркетплейсы")
    void menuMarketPlaceTest() {

        step("Открыть сайт", () -> {
            dstLabPage.openPage();
        });

        step("Клик по меню Маркетплейсы", () -> {
            dstLabPage.getMenuMarket();
        });

        step("Проверка открытия страницы Маркетплейсов", () -> {
            dstLabPage.checkMenuMarket();
        });

    }

    @Test
    @Tag("menuSiteTest")
    @DisplayName("Проверка перехода в меню Создание сайтов")
    void menuSiteTest() {

        step("Открыть сайт", () -> {
            dstLabPage.openPage();
        });

        step("Клик по меню Создание сайтов", () -> {
            dstLabPage.getMenuSite();
        });

        step("Проверка открытия страницы Создания сайтов", () -> {
            dstLabPage.checkMenuSite();
        });
    }

    @Test
    @Tag("menuContextTest")
    @DisplayName("Проверка перехода в меню Контекстная реклама")
    void menuContextTest() {

        step("Открыть сайт", () -> {
            dstLabPage.openPage();
        });

        step("Клик по меню Контекстная реклама", () -> {
            dstLabPage.getMenuContext();
        });

        step("Проверка открытия страницы Контекстная реклама", () -> {
            dstLabPage.checkMenuContext();
        });
    }

    @Test
    @Tag("getCall")
    @DisplayName("Проверка открытия формы для заказа звонка")
    void getCall() {

        step("Открыть сайт", () -> {
            dstLabPage.openPage();
        });

        step("Клик по кнопке Заказать звонок", () -> {
            dstLabPage.getCall();
        });

        step("Проверка открытия формы для заказа звонка", () -> {
            dstLabPage.checkCall();
        });
    }
}
