package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DstLabPage;

@Tag("dstLabTests")
public class DstLabTest extends TestBase {

    @Test
    public void dstLabTest() {
        DstLabPage steps = new DstLabPage();

        steps.openPage();
        steps.getMenuMarket();
        steps.checkMenuMarket();
        steps.getMenuContext();
        steps.checkMenuContext();
        steps.getMenuSite();
        steps.checkMenuSite();
        steps.getCall();
        steps.checkCall();
    }

}

