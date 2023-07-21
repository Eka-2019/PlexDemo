package testcases.homepagetests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testcases.BaseTest;

public class TalkToUsPageTests extends BaseTest {

    @Test
    public void openTalkToUsPageTest() {
        homePage.openTalkToUsPage();
        talkPage.validation("https://www.plex.com/contact-us", talkPage.getCurrentURL());
    }

    @DataProvider(name="positiveTestdata")
    public Object[][] testData() {
        return new Object [][] {
                {"First Name", "Last name", "business@email.com", "+11111111111", "Company Name", "Title", 2, 3, 2}
        };
    }

    @Test (dataProvider = "positiveTestdata")
    public void fillInFormTest(String fname, String lname, String bmail, String bphone,
                               String bcompany, String btitle, int industry_index, int country_index, int help_index) {
        homePage.openTalkToUsPage();
        talkPage.fillInForm(fname, lname, bmail, bphone, bcompany, btitle, industry_index, country_index, help_index);

    }

}
