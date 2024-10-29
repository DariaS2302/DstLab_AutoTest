package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("dstLabTests")
public class DstLabTest extends TestBase {

    @Test
    public void dstLabTest() {
        MainPage mainPage = new MainPage();
        MarketPage marketPage = new MarketPage();
        ContexPage contexPage = new ContexPage();
        SitePage sitePage = new SitePage();

        mainPage.getMenuMarket();
        marketPage.checkMenuMarket();
        mainPage.getMenuContext();
        contexPage.checkMenuContext();
        mainPage.getMenuSite();
        sitePage.checkMenuSite();
        mainPage.getCall();
        mainPage.checkCall();
    }
}

