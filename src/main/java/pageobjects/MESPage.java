package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class MESPage extends BaseMain{

    By header3 = By.xpath("//h3[contains(text(),'Production Management')]");

    public MESPage(WebDriver dr) {
        super(dr);
    }

}
