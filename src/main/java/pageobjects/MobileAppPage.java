package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.BaseMain;

@Getter
public class MobileAppPage extends BaseMain {

    By header3 = By.xpath("//h3[contains(text(), 'Multi-Device Flexibility')]");

    public MobileAppPage(WebDriver dr) {
        super(dr);
    }

}
