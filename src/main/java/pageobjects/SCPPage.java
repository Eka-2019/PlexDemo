package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class SCPPage extends BaseMain{

    By header3 = By.xpath("//h3[contains(text(),'Cross-Functional Collaboration')]");

    public SCPPage(WebDriver dr) {
        super(dr);
    }

}
