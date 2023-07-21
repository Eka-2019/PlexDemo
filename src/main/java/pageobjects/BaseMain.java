package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.Utils;

import java.util.List;

public class BaseMain extends Utils {
    WebDriver driver;
    String baseURL = "https://www.plex.com/";

    public BaseMain(WebDriver dr) {
        this.driver = dr;
    }

    public String getBaseURL() {
        driver.get(baseURL);
        return baseURL;
    }

    public void moveMouseToElement(WebElement element) {
        Actions hover = new Actions(driver);
        hover.moveToElement(element).build().perform();
    }

    public void validation(String expected, String actual){
        Assert.assertEquals(expected, actual);
    }

    public void validation(List<String> expected, List<String> actual){
        Assert.assertEquals(expected, actual);
    }

    public void validation(boolean condition){
        Assert.assertTrue(condition);
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public WebElement getPageElement(By locator){
        return driver.findElement(locator);
    }

}
