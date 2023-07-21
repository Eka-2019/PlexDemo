package testcases.homepagetests;

import org.testng.annotations.Test;
import testcases.BaseTest;

public class MenuListsTests extends BaseTest {

    @Test
    public void menuListTest() {
        homePage.validation(
                homePage.getMenuListNames(),
                homePage.expectedMenuList());
    }

    @Test
    public void subMenuProductListTest() {
        homePage.validation(
                homePage.getSubMenuListNames(0),
                homePage.expectedProductSubMenuList());
    }


    @Test
    public void subMenuPlatformListTest() {
        homePage.validation(
                homePage.getSubMenuListNames(1),
                homePage.expectedPlatformSubMenuList());
    }

    @Test
    public void subMenuIndustriesListTest() {
        homePage.validation(
                homePage.getSubMenuListNames(2),
                homePage.expectedIndustriesSubMenuList());
    }

    @Test
    public void subMenuResourcesListTest() {
        homePage.validation(
                homePage.getSubMenuListNames(3),
                homePage.expectedResourcesSubMenuList());
    }



}
