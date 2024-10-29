package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("dstLabTests")
public class DstLabTest extends TestBase {
    MainPage mainPage = new MainPage();
    MarketPage marketPage = new MarketPage();
    ContexPage contexPage = new ContexPage();
    SitePage sitePage = new SitePage();

    @Test
    public void marketPageTest() {

        mainPage.getMenuMarket();
        marketPage.checkMenuMarket();
    }

    @Test
    public void contextPageTest() {

        mainPage.getMenuContext();
        contexPage.checkMenuContext();
    }

    @Test
    public void sitePageTest() {

        mainPage.getMenuSite();
        sitePage.checkMenuSite();
    }

    @Test
    public void callPageTest() {

        mainPage.getCall();
        mainPage.checkCall();
    }

}

