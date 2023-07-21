package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class QMSPage extends BaseMain{

    By header3 = By.xpath("//h3[contains(text(),'Error-Proofed, In-Line Quality')]");

    public QMSPage(WebDriver dr) {
        super(dr);
    }

}
