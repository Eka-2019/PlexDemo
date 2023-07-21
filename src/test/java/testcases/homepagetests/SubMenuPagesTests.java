package testcases.homepagetests;

import org.testng.annotations.Test;
import testcases.BaseTest;

public class SubMenuPagesTests extends BaseTest {

    @Test
    public void openMESPageTest() {
        homePage.getSubMenuList(0);
        homePage.clickSubMenuElement("Manufacturing Execution System");
        waitForVisibilityOf(mesPage.getHeader3(),30);
        mesPage.getPageElement(mesPage.getHeader3()).isDisplayed();
        mesPage.validation("https://www.plex.com/products/manufacturing-execution-system", mesPage.getCurrentURL());
    }

    @Test
    public void openERPPageTest() {
        homePage.getSubMenuList(0);
        homePage.clickSubMenuElement("Enterprise Resource Planning");
        waitForVisibilityOf(erpPage.getHeader3(),30);
        erpPage.getPageElement(erpPage.getHeader3()).isDisplayed();
        erpPage.validation("https://www.plex.com/products/enterprise-resource-planning", erpPage.getCurrentURL());
    }

    @Test
    public void openQMSPageTest() {
        homePage.getSubMenuList(0);
        homePage.clickSubMenuElement("Quality Management System");
        waitForVisibilityOf(qmsPage.getHeader3(),30);
        qmsPage.getPageElement(qmsPage.getHeader3()).isDisplayed();
        qmsPage.validation("https://www.plex.com/products/quality-management-system", qmsPage.getCurrentURL());
    }

    @Test
    public void openSCPPageTest() {
        homePage.getSubMenuList(0);
        homePage.clickSubMenuElement("Supply Chain Planning");
        waitForVisibilityOf(scpPage.getHeader3(),30);
        scpPage.getPageElement(scpPage.getHeader3()).isDisplayed();
        scpPage.validation("https://www.plex.com/products/supply-chain", scpPage.getCurrentURL());
    }

    @Test
    public void openProductionMonitoringPageTest() {
        homePage.getSubMenuList(0);
        homePage.clickSubMenuElement("Production Monitoring");
        waitForVisibilityOf(prodPage.getHeader3(),30);
        prodPage.getPageElement(prodPage.getHeader3()).isDisplayed();
        prodPage.validation("https://www.plex.com/products/production-monitoring", prodPage.getCurrentURL());
    }

    @Test
    public void openMESAutoPageTest() {
        homePage.getSubMenuList(0);
        homePage.clickSubMenuElement("Automation & Orchestration");
        waitForVisibilityOf(mesAutoPage.getHeader3(),30);
        mesAutoPage.getPageElement(mesAutoPage.getHeader3()).isDisplayed();
        mesAutoPage.validation("https://www.plex.com/products/mes-automation-orchestration", mesAutoPage.getCurrentURL());
    }

    @Test
    public void openAssetPageTest() {
        homePage.getSubMenuList(0);
        homePage.clickSubMenuElement("Asset Performance Management");
        waitForVisibilityOf(assetPage.getHeader3(),30);
        assetPage.getPageElement(assetPage.getHeader3()).isDisplayed();
        assetPage.validation("https://www.plex.com/products/asset-performance-management", assetPage.getCurrentURL());
    }


    @Test
    public void openMobileAppPageTest() {
        homePage.getSubMenuList(1);
        homePage.clickSubMenuElement("Mobile Application");
        waitForVisibilityOf(mobPage.getHeader3(),30);
        mobPage.getPageElement(mobPage.getHeader3()).isDisplayed();
        mobPage.validation("https://www.plex.com/platform/mobile-application", mobPage.getCurrentURL());
    }


}
